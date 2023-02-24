import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int base = read.nextInt();
        int power = read.nextInt();
        System.out.println(power(base, power));
    }
    static int power(int base, int power){
        int ans = 1;
        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }
            base = base * base;
            power = power >> 1;
        }
        return ans;
    }
}
