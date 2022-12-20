import java.util.Scanner;
public class SumOfPrevNNext{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = read.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            array[i] = read.nextInt();
        }
        for(int i=0;i<size;i++){
            if(i==0){
                int sum = array[i]+array[i+1];
                System.out.print(sum+" ");
            }
            else if(i==size-1){
                int sum = array[i]+array[i-1];
                System.out.println(sum);
            }
            else{
                int sum = array[i+1]+array[i-1];
                System.out.print(sum+" ");
            }
        }
    }
}


/*
Sample input
5
1 2 3 4 5

Sample output
3 4 6 8 9

implement using java array but need to implement in c dynamic memory allocation
*/