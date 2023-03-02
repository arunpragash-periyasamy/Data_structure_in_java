import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        printFunction(num);
    }
    static void printFunction(int num){

        if(num == 0){
           return;
        }
        printFunction(num-1);
        System.out.print(num + " ");
    }
}
