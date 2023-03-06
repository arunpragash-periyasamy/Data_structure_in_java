import java.util.Scanner;

public class Triangle1 {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args){
        int n = read.nextInt();
//        method1(n,n);
//        method2(n);
//        method3(n, 0);
        method4(n, 0);
    }

    static void method1(int a,int b){
        if(a == 0 && b == 0) return;
        for(int i = 0; i < b; i++){
            System.out.print("* ");
        }
        System.out.println();
        method1(--a, --b);
    }

    static void method2(int n){
        if(n == 0) return;
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
        method2(--n);
    }

    static void method3(int row, int col){
        if(row == 0) return;
        while (col < row){
            System.out.print("* ");
            col++;
        }
        System.out.println();
        method3(--row, 0);
    }
    static void method4(int row, int col){
        if(row == 0) return;
        if(col < row){
            System.out.print("* ");
            method4(row, ++col);
        }else{
            System.out.println();
            method4(--row, 0);
        }
    }
}
