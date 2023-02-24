import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("checking prime or not");
        System.out.print("Enter a number : ");
        int number = read.nextInt();
        System.out.println(isPrime(number));
    }
    static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        int c = 2;
        while( c * c <= number){ // condition (int)(Math.sqrt(number)) <= number or c * c <= number
            if(number % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}
