import java.util.Scanner;

public class ArrayMinimum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding the minimum element in the array");
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        System.out.println("Enter the array elements: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = read.nextInt();
        }
        int result = linearSearchMinimum(array);
        System.out.println("Minimum element in the array is : "+result);
    }

//    finding the minimum element in the array using linear search
    static int linearSearchMinimum(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            min = (arr[i] < min) ? arr[i] : min;
        }
        return min;
    }
}
