import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class NumberPermutation {
    public static void main(String[] args){
        String number = "";
        NumberPermutation obj = new NumberPermutation();
        System.out.println(number);
         System.out.println(obj.letterCombinations(number).toString());
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer, char[]> hmap = new HashMap<>();
        char[] array = {'a','b','c'};
        hmap.put(2,array);
        array = new char[] {'d','e','f'};
        hmap.put(3,array);
        array =  new char[]  {'g','h','i'};
        hmap.put(4,array);
        array =  new char[]  {'j','k','l'};
        hmap.put(5,array);
        array =  new char[]  {'m','n','o'};
        hmap.put(6,array);
        array =  new char[]  {'p','q','r','s'};
        hmap.put(7, array);
        array =  new char[]  {'t','u','v'};
        hmap.put(8, array);
        array =  new char[]  {'w','x','y','z'};
        hmap.put(9, array);
        char[] num = digits.toCharArray();
        int[] nums = new int[num.length];
        for(int i = 0; i < num.length; i++){
            nums[i] = num[i] - '0';
        }
        permutation(nums, hmap, 0, new StringBuilder(""));
        return list;
    }
    static ArrayList<String> list = new ArrayList<>();
    void permutation(int[] nums, HashMap<Integer, char[]> hmap, int index, StringBuilder result){
        if(nums.length == result.length()){
            System.out.println(result);
            list.add(result.toString());
            return;
        }
        char[] array = hmap.get(nums[index]);
        for(int i = 0; i < array.length; i++){
            result = result.append(array[i]);
            System.out.println(result);
            permutation(nums, hmap, index + 1, result);
            result = result.deleteCharAt(result.length() - 1);
        }
    }
}