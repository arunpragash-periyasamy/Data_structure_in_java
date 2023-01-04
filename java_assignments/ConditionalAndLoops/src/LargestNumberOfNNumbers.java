import java.util.Scanner;

public class LargestNumberOfNNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Printing the largest of N numbers");
        int max = 0, input = 0;
        do{
            System.out.print("Enter a number: ");
            input = read.nextInt();
            max = (input > max) ? input : max;
        }while(input != 0);
        System.out.println("The largest number is " + max);
    }
}
