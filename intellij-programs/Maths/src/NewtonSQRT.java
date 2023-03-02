import java.util.Scanner;

public class NewtonSQRT {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.printf("%.3f",sqrt(n));
    }
    static double sqrt(int n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root -x) < 0.001){
                break;
            }
            x = root;
        }
        return root;
    }
}
