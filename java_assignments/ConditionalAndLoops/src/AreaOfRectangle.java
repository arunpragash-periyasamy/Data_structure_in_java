import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding the area of rectangle");
        System.out.print("Enter the breath of the rectangle: ");
        int breath = read.nextInt();
        System.out.print("Enter the length of the rectangle: ");
        int length = read.nextInt();
        System.out.println("Area of Rectangle is: "+(length*breath));
    }
}
