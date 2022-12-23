import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Multiplication table");
        System.out.print("Enter a number for a multiplication table : ");
        int number = read.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+ " * " + number + " = "+ (i*number));
        }

    }
}
