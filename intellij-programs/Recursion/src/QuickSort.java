import java.util.Arrays;
import java.util.Scanner;
class QuickSort{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i <size; array[i] = read.nextInt(), i++);
        quickSort(array, 0, size - 1);
        System.out.println(Arrays.toString(array));
    }
    static void quickSort(int[] array, int low, int high){
        if(low >= high) return;
        int start = low;
        int end = high;
        int mid = start + (end - start)/ 2;
        int pivot = array[mid];
        while(start <= end){
            while (array[start] < pivot){
                start++;
            }
            while(array[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(array, low, end);
        quickSort(array, start, high);
    }
}