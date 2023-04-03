import java.util.Scanner;
import java.util.HashMap;
public class FindTheSumPairOfKey {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int n = read.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; array[i] = read.nextInt(), i++);
        int key = read.nextInt();
        for (int i = 0; i < n; i++) {
            hmap.put(array[i], key - array[i]);
        }
        for (int i = 0; i < n; i++) {
            if(hmap.containsValue(array[i])){
                System.out.println(array[i] + "  " +hmap.get(array[i]));
            }
        }
    }
}
