import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; true; array[i] = read.nextInt(), ++i) {
            if(i == size) break;
       }
//        bubbleSort(array, size-1);
        bubbleSortMethod2(array, size - 1, 0);
        System.out.println(Arrays.toString(array));
    }
    static void bubbleSort(int[] array, int length){
        if(length == 0) return;
        for(int i = 0; i < length; i++){
            if(array[i] > array[i + 1]) swap(array, i, i+1);
        }
        bubbleSort(array, --length);
    }
    static void swap(int[] array, int start, int end){
        array[start] = array[start] + array[end];
        array[end] = array[start] - array[end];
        array[start] = array[start] - array[end];
    }
    static void bubbleSortMethod2(int[] array, int length, int index){
        if(length == 0) return;
        if(length > index){
            if(array[index] > array[index + 1]) swap(array, index, index + 1);
            bubbleSortMethod2(array, length, ++index);
        }else{
            bubbleSortMethod2(array, --length, 0);
        }
    }
}
