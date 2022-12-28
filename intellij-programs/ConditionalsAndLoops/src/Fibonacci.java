import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Fibonacci Series");
        System.out.print("Enter a number to print fibonacci: ");
        int number =read.nextInt();
        int previous = 0;
        int index = 1;
        int count = 2;
        int sum=0;
        while(count <= number){
            sum = index + previous;
            previous = index;
            index = sum;
            count++;
        }
        System.out.print(sum);
    }
}
