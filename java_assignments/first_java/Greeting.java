import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Greeting message for a given name: ");
        System.out.print("Enter your name: ");
        String name = read.nextLine();
        System.out.println("Welcome "+name);
    }
}
