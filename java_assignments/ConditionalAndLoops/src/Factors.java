import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Factors of a number");
        System.out.print("Enter a number: ");
        int number = read.nextInt();
        System.out.print(1 + " ");
        for (int i = 2; i <= number/2; i++) {
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(number);
    }
}
