import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if(findPowOfTwo(n)){
            System.out.println(n + " is a power of two");
        }else{
            System.out.println(n + " is not a power of two");
        }
    }
    static boolean findPowOfTwo(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
    }
}
