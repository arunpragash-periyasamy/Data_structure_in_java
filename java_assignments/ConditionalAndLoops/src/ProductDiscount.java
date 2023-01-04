import java.util.Scanner;

public class ProductDiscount {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Product Discount Calculation");
//        DiscountPercent();
        FindingDiscount();
    }
    static void DiscountPercent(){
        System.out.println("Product Discount By Percentage");
        System.out.print("Enter the product name: ");
        String productName = read.nextLine();
        System.out.print("Enter the product price: ");
        float productPrice = read.nextFloat();
        System.out.print("Enter the discount percent: ");
        float productDiscount = read.nextFloat();
        float sellingPrice = productPrice*((100 - productDiscount)/100);
        System.out.println("\n\n\nProduct Name: " + productName);
        System.out.println("Product Original Price: " + productPrice);
        System.out.println("Product Selling Price: " + sellingPrice);
    }
    static void FindingDiscount(){
        System.out.println("Finding Discount Price");
        System.out.println("Enter Product name: ");
        String productName = read.nextLine();
        System.out.print("Enter Product Price: ");
        float productPrice = read.nextFloat();
        System.out.print("Enter Selling Price: ");
        float productSellingPrice = read.nextFloat();

    }
}
