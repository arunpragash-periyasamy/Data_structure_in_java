import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter the operator: ");
            char ch = read.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.print("Enter a number 1: ");
                int number1 = read.nextInt();
                System.out.print("Enter a number 2: ");
                int number2 = read.nextInt();

                if(ch == '+'){
                    ans = number1 + number2;
                }
                else if(ch == '-'){
                    ans = number1 - number2;
                }
                else if(ch == '*'){
                    ans = number1 * number2;
                }
                else if(ch == '/'){
                    ans = number1 / number2;
                }
                else if(ch == '%'){
                    ans = number1 % number2;
                }
                System.out.println(ans);
            }
            else if(ch == 'x' || ch == 'X'){
                System.out.println("Program exited");
                break;
            }
            else{
                System.out.println("Invalid operator");
            }
        }
    }
}
