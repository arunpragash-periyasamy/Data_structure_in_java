import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Q: take two numbers and print the sum
        Scanner read = new Scanner(System.in);
        System.out.println("Sum of two numbers");
        System.out.print("Enter a number 1: ");
        int number1 = read.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = read.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum = " + sum);
    }
}