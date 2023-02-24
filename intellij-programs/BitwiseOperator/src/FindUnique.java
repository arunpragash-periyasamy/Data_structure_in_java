import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding the unique elements in an array");
        System.out.print("Enter the size of the array: " + "");
        int size = read.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        System.out.println(uniqueElement(array));
    }
    public static int uniqueElement(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
