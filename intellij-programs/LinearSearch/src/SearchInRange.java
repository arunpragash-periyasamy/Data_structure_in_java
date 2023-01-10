import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        System.out.println("Searching elements in the given range");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = read.nextInt();
        System.out.print("Enter the array elements: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        System.out.print("Enter the target element to search: ");
        int target = read.nextInt();
        System.out.print("Enter the range start and end: ");
        int start = read.nextInt(), end = read.nextInt();
        int result = linearsearch(array, target, start, end);
        if(result == 0){
            System.out.println("Error in the range given");
        }else if(result == -1){
            System.out.println("Element is not found in the given range");
        }else{
            System.out.println("Element found !!! :)");
        }

    }
    static int linearsearch(int[] arr, int target, int start, int end){
        if(end < start || end > arr.length || arr.length == 0){
            return 0;
        }
        for(int i = start; i <= end; i++){
            if(arr[i] == target) return 1;
        }
        return -1;
    }
}
