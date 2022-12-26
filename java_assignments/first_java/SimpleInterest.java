import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculation");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a principal amount: ");
        int principal = read.nextInt();
        System.out.print("Enter a Interest rate percentage: ");
        int percentageRate = read.nextInt();
        System.out.print("Enter a time period(year): ");
        int time = read.nextInt();
        int interest = (principal*percentageRate)/time;
        System.out.println("Total Interest: "+interest);
        System.out.println("End balance: "+(interest+principal));
    }
}
