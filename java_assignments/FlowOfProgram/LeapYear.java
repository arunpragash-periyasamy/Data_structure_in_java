
import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int year){
        boolean result = ((year%4==0)||((year%100==0)&&(year%400 ==0))) ? true : false;
            return result;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Checking Leap Year Or Not");
        System.out.print("Enter a year : ");
        int year = read.nextInt();
        String result = (LeapYear.checkLeapYear(year)) ? "It is a leap year" : "It is not a leap year";
        System.out.println(result);
    }
}
