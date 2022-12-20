import java.util.Scanner;
public class SumOfOtherElements{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        int sum=0;
        for(int i=0;i<size;i++){
            array[i] = read.nextInt();
            sum += array[i];
        }
        for(int i=0;i<size;i++){
            System.out.print((sum-array[i])+" ");
        }
    }
}