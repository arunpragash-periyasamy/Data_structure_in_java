import java.util.Scanner;

public class SumOfNIntegers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Sum of N numbers untill getting a character");
        int sum = 0;
        while(true){
            if(read.hasNextInt()){
                sum += read.nextInt();
            }
            else{
                    break;
            }
        }
        System.out.println(sum);
    }
}
