import java.util.Scanner;

public class CountNoOfZeros {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        System.out.println(count(number));
    }
    static int count(int number){
        return countZeros(number, 0);
    }
    static int countZeros(int number, int count){
        if(number == 0) return count;
        if(number % 10 == 0) count++;
        return countZeros(number/10, count);
    }
}
