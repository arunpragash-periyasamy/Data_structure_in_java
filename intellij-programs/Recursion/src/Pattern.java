import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();


//        //Don't use this if else approach
//        for (int i = 0; i < n; i++) {
//            for(int j = n; j > 0 ; j--){
//                if(i >= j - 1){
//                    System.out.print(" *");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }



//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i ; j++) {
//                System.out.print(" *");
//            }
//            System.out.println();
//        }
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i + 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++){
                System.out.print("  ");
            }
            for (int j = n; j > i ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
