import java.util.Scanner;
import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = read.nextInt();
        }
        mergeSortInPlace(array, 0, size);
        System.out.println(Arrays.toString(array));
    }
    static void mergeSortInPlace(int[] array, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortInPlace(array, start, mid);
        mergeSortInPlace(array, mid, end);
        mergeInPlace(array, start, mid, end);
    }
    static void mergeInPlace(int[] array, int start, int mid, int end){
        int i = start;
        int j = mid;
        int k = 0;
        int[] mix = new int[end - start];
        while(i < mid && j < end){
            if(array[i] < array[j]){
                mix[k] = array[i];
                i++;
            }else{
                mix[k] = array[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = array[i];
            i++;
            k++;
        }
        while(j < end){
            mix[k] = array[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            array[start + l] = mix[l];
        }
        System.arraycopy(mix, 0, array, start + 0, mix.length);
    }
}
