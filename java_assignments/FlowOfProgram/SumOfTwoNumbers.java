import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Sum Of Two Numbers");
        System.out.print("Enter the number 1 : ");
        int number1 = read.nextInt();
        System.out.print("Enter the number 2 : ");
        int number2 = read.nextInt();
        System.out.println("Sum of two number is : " + (number1+number2));
    }
}
