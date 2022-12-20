import java.util.Scanner;
public class BeforeSwap{
    public static void main(String[] arguments){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
            array[i]=read.nextInt();
        }
        int temp = array[0];
        array[0] = array[size-1];
        array[size-1] = temp;
        System.out.println("After swapping");
        for(int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}


/* 
Sample input
10
3 4 5 6 7 8 1 2 3 9

Sample output
9 4 5 6 7 8 1 2 3 3

Performed by normal array but need to implement using circular linked list
*/