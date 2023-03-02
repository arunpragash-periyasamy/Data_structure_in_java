import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println(sumOfDigits(number));
    }
    static int sumOfDigits(int num){
        if(num == 0)
        return 0;
        int rem = num % 10;
        return rem + sumOfDigits(num/10);
    }
}
