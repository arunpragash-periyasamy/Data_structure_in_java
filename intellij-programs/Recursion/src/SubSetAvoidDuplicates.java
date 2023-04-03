import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSetAvoidDuplicates {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; array[i] = read.nextInt(), i++);
        System.out.println(subset(array));
    }

    static List<List<Integer>> subset(int... array){
        insertionSort(array);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int end = list.size();
        for (int i = 0; i < array.length; i++) {
            int start = 0;
            if(i > 0 && array[i] == array[i - 1]){
                start = end;
            }
            end = list.size();
            for (int j = start; j < end; j++) {
                List<Integer> innerList = new ArrayList<>(list.get(j));
                innerList.add(array[i]);
                list.add(innerList);
            }
        }
        list.remove(0);
        return list;
    }

    static void insertionSort(int... array){
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j - 1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
