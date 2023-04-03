import java.util.Scanner;
import java.util.HashMap;
public class anagram {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner read = new Scanner(System.in);
        char[] s1 = read.next().toCharArray();
        char[] s2 = read.next().toCharArray();
        int val = 0;
        for(char c : s1){
            int key = (int)c;
            int value = 0;
            if(!map.containsKey(key)){
                value = 1;
                map.put(key, value);
            }else{
                value = map.get(key) + 1;
                map.put(key, value);
            }
        }
        boolean check = true;
        for(char c : s2){
            int key = (int)c;
            int value = 0;
            if(map.containsKey(key)){
                value = map.get(key) - 1;
                if(value <= 0){
                    map.remove(key);
                }else{
                    map.put(key, value);
                }
            }else{
                check = false;
            }
        }
        System.out.println(check);
    }
}
