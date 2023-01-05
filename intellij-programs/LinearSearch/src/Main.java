import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Linear Search in array");
        System.out.print("Enter a size of an array: ");
        int size = read.nextInt();
        System.out.println("Enter the array elements");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        System.out.print("Enter a element to search: ");
        int target = read.nextInt();
        int result = linearSearch(array, target);
        if(result == -1){
            System.out.println("Element not found in array");
        }else{
            System.out.println("Element found in the index of " + result);
        }
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}