import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

//        Array initialization;


//        int[][] arr = new int[3][];

//        int [][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };



//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        for (int[] i: arr) {
//            for(int j : i){
//                System.out.print(j + " ");
//            }
//            System.out.println("");
//        }

//        getting the input of the 2d array
        Scanner read = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = read.nextInt();
            }
        }

        for (int[] i : arr1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
