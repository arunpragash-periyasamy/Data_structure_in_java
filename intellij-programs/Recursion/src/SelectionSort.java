import java.util.Arrays;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; array[i] = read.nextInt(), ++i);
        selectionSort(array, 1, size - 1, 0);
        System.out.println(Arrays.toString(array));
    }
    static void selectionSort(int[] array, int index, int length, int max){
        if(length == 0) return;
        if(length > index){
            if(array[max] < array[index]) {
                max = index;
            };
            selectionSort(array, ++index, length, max);
        }else{
            if(array[length] < array[max]) swap(array, max, length);
            selectionSort(array, 1, --length, 0);
        }
    }
    static void swap(int[] array, int start, int end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
}
