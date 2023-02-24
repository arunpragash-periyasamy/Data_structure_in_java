import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    static int setBits(int n){
        int count = 0;
//        while(n > 0){
//            count++;
//            n -= n & -n;
//        }

//        while(n > 0 ){
//            if((n&1) == 1){
//                count++;
//            }
//            n >>= 1;
//        }

        while(n > 0){
            count++;
            n &= n-1;
        }
        return count;
    }
}
