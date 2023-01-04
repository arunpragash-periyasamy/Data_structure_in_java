import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Checking three digit Armstrong Number");
//        System.out.print("Enter a number: ");
//        int number = read.nextInt();
//        System.out.println(isArmstrong(number));

        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " "); // 153 370 371 407
            }
        }

    }

    static boolean isArmstrong(int number) {
        int num = number;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += (rem * rem * rem);
            num = num / 10;
        }
        return (number == sum);
    }

}
