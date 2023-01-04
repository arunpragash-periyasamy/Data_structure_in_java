import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Addition of two numbers");
        System.out.print("Enter a number1: ");
        int number1 = read.nextInt();
        System.out.print("Enter a number2: ");
        int number2 = read.nextInt();
        System.out.println("Addition: " + (number1 + number2));
    }
}
