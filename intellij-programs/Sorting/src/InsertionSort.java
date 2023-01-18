import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {5,3,4,1,2,-12,-32,0};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
//    static void sorting(int[] arr){
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = i+1; j > 0; j--) {
//                if(arr[j] < arr[j-1]){
//                    arr[j] = arr[j] + arr[j-1];
//                    arr[j-1] = arr[j] - arr[j-1];
//                    arr[j] = arr[j] - arr[j-1];
//                }else{
//
//                    break;
//                }
//            }
//        }
//    }
    static void sorting(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    static void swap(int[] arr, int start, int end){
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
    }
}