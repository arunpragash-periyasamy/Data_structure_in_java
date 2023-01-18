import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int max = findMax(arr, 0, lastIndex);
            if(max != lastIndex){  // if max is equal to the lastindex then the value become zero
                swap(arr, max, lastIndex);
            }
        }
    }

    static void swap(int[] arr, int max, int lastIndex){
        arr[max] = arr[max] + arr[lastIndex];
        arr[lastIndex] = arr[max] - arr[lastIndex];
        arr[max] = arr[max] - arr[lastIndex];
    }

//    static void selectionSort(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            int lastIndex = arr.length - i - 1;
//            int max = findMax(arr, 0, lastIndex);
//            int temp = arr[max];
//            arr[max] = arr[lastIndex];
//            arr[lastIndex] = temp;
//        }
//    }

    static int findMax(int[] arr, int start, int end){
        int max = 0;
        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return max;
    }
}
