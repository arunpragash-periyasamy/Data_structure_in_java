import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Print N Fibonacci numbers");
        System.out.print("Enter a N number : ");
        int number = read.nextInt();
        int number1 = 0;
        int number2 = 1;
        if(number == 1 ){
            System.out.print(number1);
        }
        else if(number == 2 ){
            System.out.println(number1+" "+number2);
        }
        else if(number>2){
            System.out.print(number1+" "+number2+" ");
            for(int i=2;i<number;i++){
                int number3 = number1+number2;
                number1 = number2;
                number2 = number3;
                System.out.print(number3+" ");
            }
        }
    }
}
