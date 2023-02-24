import java.util.Scanner;

public class NoOfDigits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Find the no of digits in binary representation");
        System.out.print("Enter the number : ");
        int n = read.nextInt();
        int b = 2;
        int ans = findCount(n);
//        int ans = (int)(Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
    static int findCount(int n){
        int count = 0;
        while(n > 0){
            n = n >> 1;
            count++;
        }
        return count;
    }
}
