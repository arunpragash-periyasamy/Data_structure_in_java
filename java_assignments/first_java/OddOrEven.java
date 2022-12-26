import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Checking Whether a number is odd or even: ");
        System.out.print("Enter a number: ");
        int number = read.nextInt();
        if(number%2 == 0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given numnber is odd");
        }
    }
}
