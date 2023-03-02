import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n1 = read.nextInt();
        int n2= read.nextInt();
        System.out.println(gcd(n1,n2));
        System.out.println(lcm(n1,n2));
    }

    static int lcm(int n1, int n2){
        return n1 * n2 / gcd(n1, n2);
    }
    static int gcd(int n1, int n2){
        if(n1 == 0){
            return n2;
        }
        return gcd(n2%n1, n1);
    }
}
