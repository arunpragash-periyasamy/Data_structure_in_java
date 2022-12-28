import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a numnber to find amstrong number");
        int number = read.nextInt();
        int count =0;
        int temp = number;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        temp = number;
        int amstrong = 0;
        while(temp > 0){
            amstrong += Math.pow((temp % 10),count);
            temp/=10;
        }
        if(amstrong == number){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not an Amstrong Number");
        }

    }
}
