import java.util.Scanner;

public class CeilingNumber {
    public static void main(String[] args) {
        System.out.println("Binary search for the finding ceiling number");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = read.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target = read.nextInt();
        int result = binarySearch(arr, 0, size-1, target);
        if(result == -1){
            System.out.println("Ceiling of the element is not found");
        }else{
            System.out.println("Ceiling element of the target " + target + " is " + result);
        }
    }

    static int binarySearch(int[] arr, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[arr.length-1]) return -1;
            if(arr[mid] == target) return arr[mid];
            if(arr[mid] > target) end = mid - 1;
            if(arr[mid] < target) start = mid + 1;
        }
        return arr[start];
    }
}
