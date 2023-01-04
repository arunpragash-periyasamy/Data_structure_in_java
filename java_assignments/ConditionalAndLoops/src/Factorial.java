import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = read.nextInt();
        int fact = 1;
        for(int i = 1; i <= number; i++ ){
            fact *= i;
        }
        System.out.println(fact);
    }
}
