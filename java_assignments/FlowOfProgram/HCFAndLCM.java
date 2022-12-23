import java.sql.SQLOutput;
import java.util.Scanner;

public class HCFAndLCM {

    public static int gcd(int number1, int number2){
        if(number2 == 0){
            return number1;
        }
        else{
            return gcd(number1, number1%number2);
        }
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding HCF and LCM");
        System.out.print("Enter a number 1 : ");
        int number1 = read.nextInt();
        System.out.print("Enter a number2 : ");
        int number2 =read.nextInt();
        int hcf = gcd(number1 , number2);
        int lcm = (number1 * number2)/hcf;
        System.out.println("HCF or GCD of the given numbers is : "+hcf);
        System.out.println("LCM of the given two numbers is : "+lcm);
    }
}
