import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; array[i] = read.nextInt(), ++i);
        array = mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
    static int[] mergeSort(int[] array){
        if(array.length == 1){
            return  array;
        }
        int mid =array.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int[] mergedArray = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mergedArray[k] = first[i];
                i++;
            }else{
                mergedArray[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length){
            mergedArray[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mergedArray[k] = second[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}
