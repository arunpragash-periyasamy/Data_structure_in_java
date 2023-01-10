import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        System.out.println("Binary search algorithm");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        System.out.print("Enter the array elements: ");
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = read.nextInt();
        }
        System.out.print("Enter the target element to search: ");
        int target = read.nextInt();
        Arrays.sort(array);
        if(binarySearch(array, 0,size-1,target)){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
    static boolean binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return true;
            }
            if(arr[mid] < target){
                start = mid+1;
            }
            if(arr[mid] > target){
                end = mid -1;
            }
        }
        return false;
    }
}