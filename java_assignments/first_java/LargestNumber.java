import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding the largest of two numbers: ");
        System.out.print("Enter a number 1: ");
        int number1 = read.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = read.nextInt();
        if(number1>number2){
            System.out.println(number1+" is largest number");
        }else if(number1<number2){
            System.out.println(number2+" is largest number");
        }else{
            System.out.println("Both the elements are equal: "+number1);
        }
    }
}
