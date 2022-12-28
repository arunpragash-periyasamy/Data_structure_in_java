import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Reverse a number");
        System.out.print("Enter a number: ");
        long number = read.nextLong();
        long reverseNumber = 0;
        while(number > 0){
            int temp = (int)(number % 10);
            number = number/10;
            reverseNumber = (reverseNumber*10)+temp;
        }
        System.out.println(reverseNumber);
    }
}
