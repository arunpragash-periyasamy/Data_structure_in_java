import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner read =new Scanner(System.in);
        System.out.println("Finding the largest of three numbers");
        System.out.print("Enter number 1: ");
        int number1 = read.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = read.nextInt();
        System.out.print("Enter a number 3: ");
        int number3 = read.nextInt();

//        int max = number1;
//        if(number2 > max){
//            max = number2;
//        }
//        if(number3 > max){
//            max = number3;
//        }

//        predefined function
        int max = 0;
        max = Math.max(number1, number2);
        max = Math.max(number3, max);
        System.out.println(max);

    }
}
