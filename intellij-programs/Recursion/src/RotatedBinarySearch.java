import java.util.Scanner;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = read.nextInt();
        }
        int target = read.nextInt();
        System.out.println(searchBinary(arr, target, 0, size - 1));
    }
    static int searchBinary(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return searchBinary(arr, target, start, mid - 1);
            }else{
                return searchBinary(arr, target, mid + 1, end);
            }
        }

        if(target >= arr[mid] && target <= arr[end]){
            return searchBinary(arr, target, mid + 1, end);
        }
        return searchBinary(arr, target, start, mid -1);
    }
}
