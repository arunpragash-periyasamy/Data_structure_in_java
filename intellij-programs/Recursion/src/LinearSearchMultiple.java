import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchMultiple {
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = read.nextInt();
        }
        int target = read.nextInt();
        linearSearch(array, target, 0);
        System.out.println(list.toString());
    }
    static void linearSearch(int[] array, int target, int index){
        if(index == array.length) return;
        if(array[index] == target) list.add(index);
        linearSearch(array, target, ++index);
    }
}
