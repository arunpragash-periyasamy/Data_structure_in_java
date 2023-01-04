import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding the area of triangle");
        System.out.print("Enter the base of the triangle(cm): ");
        int base = read.nextInt();
        System.out.print("Enter the height of the triangle(cm): ");
        int height = read.nextInt();
        int area = (base * height)/2; // formula = 1/2 * base * height;
        System.out.println("Area of trinagle is: "+ area);
    }
}
