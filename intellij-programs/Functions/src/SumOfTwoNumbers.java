import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {

//        function without return value
//        sum();

//        function return value without parameter
//        int ans = sum2();

//        function with return value with passing parameter
        int ans = sum3(293,203);

        System.out.println(ans);
    }

    static int sum3(int a, int b){
        int sum =a + b;
        return sum;
    }
    static int sum2(){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = read.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = read.nextInt();
        int sum = number1 + number2;
        return sum;
    }
    static void sum(){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = read.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = read.nextInt();
        int sum = number1 + number2;
        System.out.println("The sum = " + sum);

    }
}
