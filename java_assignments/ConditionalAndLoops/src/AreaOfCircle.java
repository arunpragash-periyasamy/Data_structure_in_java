import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        final double pi = 3.14;
        Scanner read = new Scanner(System.in);
        System.out.println("Finding the area of circle");
        System.out.print("Enter the radius: ");
        int radius = read.nextInt();
        System.out.print("Is the radius is in mm press Y else press n:");
        char ch = read.next().trim().charAt(0);
        double area = pi;
        if(ch == 'Y' || ch == 'y'){
            area *= (radius*radius); // formula if radius in mm = 3.14 * radius * radius;
        }else{   // it will calculate the radius in cm
            radius = 2*radius;
            area *= (radius*radius); //
            /*
            formula if radius in cm
            radius = radius * 2;
            area = pi * r * r;
            * */
        }
        System.out.println(area);
    }
}
