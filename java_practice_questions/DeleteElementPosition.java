import java.util.Scanner;
public class DeleteElementPosition{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            array[i]=read.nextInt();
        }
        System.out.println("Enter the position to delete the element: ");
        int position = read.nextInt();
        for(int i=0;i<size;i++){
            if(i!=position-1){
                System.out.print(array[i]+" ");
            }
        }
    }
}