import java.util.ArrayList;
import java.util.Scanner;

public class ReturnLinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        int target = read.nextInt();
        System.out.println(linearSearch(array, target, 0, list).toString());
    }
    static ArrayList<Integer> linearSearch(int[] array, int target, int index, ArrayList<Integer> list){
        if(index == array.length) return list;
        if(array[index] == target) list.add(index);
        return linearSearch(array, target, ++index, list);
    }
}
