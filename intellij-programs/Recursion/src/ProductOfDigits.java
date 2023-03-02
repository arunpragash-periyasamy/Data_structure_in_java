import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println(product(number));
    }
    static  int product(int number){
        if(number == 0) return 1;
        int rem = number % 10;
        return rem * product(number/10);
    }
}
