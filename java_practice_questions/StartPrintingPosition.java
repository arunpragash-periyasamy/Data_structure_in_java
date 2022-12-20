import java.util.Scanner;
public class StartPrintingPosition{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        int[] array = new int[size]; 
        System.out.println("\nEnter the Array Elements: ");
        for(int i=0;i<size;i++){
            array[i] = read.nextInt();
        }
        System.out.print("Enter the index to print: ");
        System.out.println("");
        int index = read.nextInt();
        for(int i=index-1; i<size;i++){
            System.out.print(array[i]+" ");
        }
        for(int i = 0; i< index-1;i++){
            System.out.print(array[i]+" ");
        }
    }
}


/*
Sample input 
5
10 20 30 40 50
4
40 50 10 20 30

executed using normal array but need to implement using linked list
 */