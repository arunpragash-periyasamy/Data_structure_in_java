import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size = read.nextInt();
        System.out.println("Enter an array elements : ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        System.out.println(subset(array));
    }
//    static List<List<Integer>> subset(int[] array){
//        List<List<Integer>> list = new ArrayList<>();
//
//        list.add(new ArrayList<>());
//
//        for(int nums : array){
//            int n = list.size();
//            for (int i = 0; i < n; i++) {
//                List<Integer> innerList = new ArrayList<>(list.get(i));
//                innerList.add(nums);
//                list.add(innerList);
//            }
//        }
//        list.remove(0);
//        return list;
//    }

    static List<List<Integer>> subset(int[] array){
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        for(int num: array){
            int size = list.size();
            for(int i = 0; i < size; i++){
                List<Integer> innnerList = new ArrayList<>(list.get(i));
                innnerList.add(num);
                list.add(innnerList);
            }
        }
        list.remove(0);
        return list;
    }
}
