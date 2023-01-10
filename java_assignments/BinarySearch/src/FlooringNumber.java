import java.util.Scanner;

public class FlooringNumber {
    public static void main(String[] args) {
        System.out.println("Finding the floor of the given number using binary search");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        System.out.print("Enter the array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = read.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = read.nextInt();
        int ans = binarySearchFlooring(arr, 0, size-1, target);
        if(ans == -1){
            System.out.println("Element is not found in the array");
        }else{
            System.out.println("Floor of the number is " + ans);
        }
    }
    static int binarySearchFlooring(int[] arr,int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[0]) return -1;
            if(arr[mid] == target) return arr[mid];
            if(arr[mid] > target) end = mid - 1;
            if(arr[mid] < target) start = mid + 1;
        }
        return arr[end];
    }
}
