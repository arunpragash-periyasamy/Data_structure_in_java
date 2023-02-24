import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        pattern6(n);
    }
    static void pattern6(int n){/*
     *Input
     * 5
     *
     * Output:
     *        *
     *       **
     *      ***
     *     ****
     *    *****
     *
     *
     *
     * */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(j)
            }
            for (int j = n*2 - i; i > n && j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){/*
     *Input
     * 5
     *
     * Output:
     *  *
     *  **
     *  ***
     *  ****
     *  *****
     *  ****
     *  ***
     *  **
     *  *

     *
     *
     * */
        for (int i = 1; i <= n*2; i++) {
            for (int j = 1; j <= i && i <=n; j++) {
                System.out.print("* ");
            }
            for (int j = n*2 - i; i > n && j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){/*
     *Input
     * 4
     *
     * Output:
     *  1
     *  1 2
     *  1 2 3
     *  1 2 3 4
     *
     *
     * */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        /*
         *Input
         * 4
         *
         * Output:
         *  * * * *
         *  * * *
         *  * *
         *  *
         *
         *
         * */
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        /*
         *Input
         * 4
         *
         * Output:
         *  *
         *  * *
         *  * * *
         *  * * * *
         *
         *
         * */
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        /*
        *Input
        * 4
        *
        * Output:
        *  * * * *
        *  * * * *
        *  * * * *
        *  * * * *
        *
        *
        * */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
