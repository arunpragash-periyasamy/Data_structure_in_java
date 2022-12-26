import java.util.Scanner;

public class RupeesToDollars {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Rupees to Dollar Conversion");
        System.out.print("Enter rupees value: ");
        float rupees = read.nextFloat();
        float dollar = rupees/82.67f; // dollar rate in 26.12.2022
        System.out.println("Rupees: "+rupees+" to Dollars: "+dollar);
    }
}
