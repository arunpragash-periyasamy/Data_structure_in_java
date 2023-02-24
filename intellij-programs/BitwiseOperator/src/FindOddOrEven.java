import java.util.Scanner;

public class FindOddOrEven {
    public static void main(String[] args) {
        FindOddOrEven object = new FindOddOrEven();
        System.out.println("Finding add or even using & operator:");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number to find odd or even : ");
        int number = read.nextInt();
        if(object.isOdd(number)){
            System.out.println(number + " is odd");
            return;
        }
        System.out.println(number + " is even");
    }
    public boolean isOdd(int num){
        if((num & 1) == 1){
            return true;
        }
        return false;
    }
}
