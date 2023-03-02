import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println(isPalindrome(number));
    }

    static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    static int reverse(int number){
        int digits = (int)(Math.log10(number)) + 1;
        return reverseNumber(number, digits);
    }

    static int reverseNumber(int num, int digits){
        if(num < 10) return num;
        int rem = num % 10;
        return rem * (int)(Math.pow(10,digits - 1)) + reverseNumber(num/10, digits-1);
    }
}
