import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println(sum(number));
    }
    static int sum(int num){
        if(num <= 1) return 1;
        return num + sum(num - 1);
    }
}
