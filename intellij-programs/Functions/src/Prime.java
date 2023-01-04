import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Checking prime or not using methods");
        System.out.print("Enter a number: ");
        int number = read.nextInt();
        System.out.println(isPrime(number));
    }
    static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        int a = 2;
        while(a*a <= number){
            if(number % a == 0) return false;
            a++;
        }
        return (a * a > number);
    }
}
