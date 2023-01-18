import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1,4,6};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr){
        int start = 0;
        while(start < arr.length){
            int correct = arr[start] - 1;
            if(arr[correct] != arr[start]){
                swap(arr, start, arr[start]-1);
            }else{
                start++;
            }
        }
    }
    static void swap(int[] arr, int start, int end){
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
    }
}