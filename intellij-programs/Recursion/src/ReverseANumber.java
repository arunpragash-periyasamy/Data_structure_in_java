import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        reverse(number);
        System.out.println((reverse1(number)));
        System.out.println(x);
    }

    static int reverse1(int num){
        int digits = (int)(Math.log10(num))+1;
        return helper(num, digits);
    }

    static int helper(int num, int digits){
        if(num % 10 == num){
            return num;
        }
        int rem = num % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(num/10, digits-1);
    }

    static int x = 0;
    static void reverse(int num){
        x = x * 10 + num % 10;
        if(num < 10)
            return;
        reverse(num/10);
    }
}
