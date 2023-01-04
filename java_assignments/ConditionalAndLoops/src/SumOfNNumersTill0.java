import java.util.Scanner;

public class SumOfNNumersTill0 {
    public static void main(String[] args) {
        System.out.println("Sum of N numbers till enters 0");
        Scanner read = new Scanner(System.in);
        int input = 0;
        long sum = 0;
        do{
            System.out.print("Enter a number: ");
            input = read.nextInt();
            sum += input;
        }while(input != 0);
        System.out.println("Sum is " + sum);
    }
}
