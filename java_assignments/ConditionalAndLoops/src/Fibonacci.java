import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Fibonacci series");
        System.out.print("Enter a number: ");
        int number = read.nextInt();
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for(int i = 2; i < number; i++){
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            System.out.print(temp + " ");
        }
    }
}
