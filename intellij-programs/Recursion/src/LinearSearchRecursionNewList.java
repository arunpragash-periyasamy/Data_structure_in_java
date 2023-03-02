import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearchRecursionNewList {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        int target = read.nextInt();
        System.out.println(linearSearch(array, target, 0).toString());
    }
    static ArrayList<Integer> linearSearch(int[] array, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(array[index] == target) list.add(index);
        if(index == array.length - 1) return list;
        list.addAll(linearSearch(array, target, ++index));
        return list;
    }
}
