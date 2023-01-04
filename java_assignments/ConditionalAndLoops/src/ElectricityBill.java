import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Electricity Bill Calculation");
        System.out.print("Enter old reading: ");
        int oldReading = read.nextInt();
        System.out.print("Enter new reading: ");
        int newReading = read.nextInt();
        int reading = newReading - oldReading;
        int price = 0;
        if(reading <= 100){
            System.out.println(reading * 10);
        }else if(reading > 100 && reading <=200){
            System.out.println(reading * 15);
        }else if(reading > 200 && reading <= 300){
            System.out.println(reading * 20);
        }else {
            System.out.println(reading * 25);
        }
    }
}
