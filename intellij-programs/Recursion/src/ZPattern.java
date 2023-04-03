import java.util.Scanner;

public class ZPattern {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }
}
