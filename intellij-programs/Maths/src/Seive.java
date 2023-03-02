import java.util.Arrays;
import java.util.Scanner;

public class Seive {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Prime number till n");
        System.out.print("Enter the number: ");
        int n = read.nextInt();
        boolean[] prime = new boolean[n+1];
        isPrime(n, prime);
        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }
        }
    }
    static void isPrime(int n, boolean[] prime){
        for(int i = 2; i * i <= n; i++){
            if(!prime[i]){
                for (int j = i*2; j <= n ; j += i) {
                    prime[j] = true;
                }
            }
        }
    }
}
