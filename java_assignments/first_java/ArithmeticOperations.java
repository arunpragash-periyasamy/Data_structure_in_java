import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("Perfom Arithmetic Operations");
        Scanner read = new Scanner(System.in);
        Scanner stringRead = new Scanner(System.in);
        System.out.print("Enter a number 1: ");
        int number1 = read.nextInt();
        System.out.print("Enter a number 2: ");
        int number2 = read.nextInt();
        System.out.print("Enter a operator: ");
        String operator = stringRead.next();
        if(operator.equals("+")){
            int sum = number1 + number2;
            System.out.println("Sum of "+number1+" and "+number2+" is: "+sum);
        }else if(operator.equals("-")){
            int subtract = number1 - number2;
            System.out.println("Subtractio of "+number1+" and "+number2+" is: "+subtract);
        } else if (operator.equals("/")) {
            int division = number1/number2;
            System.out.println("Division of "+number1+" and "+number2+" is: "+division);
        } else if (operator.equals("*")) {
            int multiply = number1*number2;
            System.out.println("Multiply of "+number1+" and "+number2+" is "+multiply);
        } else if (operator.equals("%")) {
            int modulo = number1%number2;
            System.out.println("Modulo of "+number1+" and "+number2+" is "+modulo);
        } else{
            System.out.println("Invalid operator ");
        }
    }
}
