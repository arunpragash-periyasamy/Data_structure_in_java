import java.util.Scanner;

public class FormulaProblems {
    static Scanner read = new Scanner(System.in);
    static final double pi = 3.14;
    public static void main(String[] args) {
//        AreaOfCircle();
//        AreaOfRectangle();
//        AreaOfTriangle();
//        AreaOfParallelogram();
        AreaOfRhombus();
    }


//    Area of circle
    static void AreaOfCircle(){
        /* formula
        *   pi * r * r ;
        * */
        System.out.println("Finding the area of circle");
        System.out.print("Enter a radius: ");
        int radius = read.nextInt();
        System.out.println("Area of circle is : " + (pi * radius * radius));
    }

//    Area of Rectangle
    static void AreaOfRectangle(){
        /*
        * formula
        * length * breadth
        * */
        System.out.println("Finding the area of rectangle");
        System.out.print("Enter the length of the rectangle: ");
        int length = read.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = read.nextInt();
        System.out.println("Area of the rectangle: " + (length * breadth));
    }


//    Area of Triangle
    static void AreaOfTriangle(){
        /*
        * formula
        *  1/2 * base * height
        * */
        System.out.println("Finding the Area of circle");
        System.out.print("Enter the base of the triangle: ");
        int base = read.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = read.nextInt();
        double area = (base * height)/2;
        System.out.println("Area of the triangle: " + area );
    }

//    Area of Parallelogram
    static void AreaOfParallelogram(){
        System.out.println("Finding the Area of Parallelogram");
        System.out.print("Enter the base: ");
        int base = read.nextInt();
        System.out.print("Enter the height: ");
        int height = read.nextInt();
        System.out.println("Area of Parallelogram: " + (base * height));
    }

    static void AreaOfRhombus(){
        /*
        * formula
        * 1/2 * d1 * d2;
        * */
        System.out.println("Area Of Rhombus");
        System.out.print("Enter a diagonal 1: ");
        int diagonal1 = read.nextInt();
        System.out.print("Enter a diagonal 1: ");
        int diagonal2 = read.nextInt();
        System.out.println("Area of Rhombus: " + ((diagonal1 * diagonal2)/2));
    }
}
