import java.util.Scanner;

public class CountDigitOccurances {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Find the number of times the digit occurances in a given number");
        System.out.print("Enter a number: ");
        long number = read.nextLong();
        System.out.print("Enter a digit: ");
        int digit = read.nextInt();
        int count = 0;
        while(number > 0){
            int rem = (int)(number % 10);
            if(rem == digit){
                count++;
            }
            number=number/10;
        }
        System.out.println(count);
    }
}
