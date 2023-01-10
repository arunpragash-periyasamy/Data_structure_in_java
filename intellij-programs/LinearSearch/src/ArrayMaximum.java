import java.util.Scanner;

public class ArrayMaximum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Maximum in the 2d array");
        System.out.print("Enter the size of the row: ");
        int row = read.nextInt();
        System.out.print("Enter the size of the column: ");
        int column = read.nextInt();
        int[][] arr = new int[row][column];
        for(int i = 0; i < row; i++){
            System.out.println("Enter the elements of the row " + (i+1));
            for (int j = 0; j < column; j++) {
                arr[i][j] = read.nextInt();
            }
        }
        System.out.println(maximum(arr));
    }
    static int maximum(int[][] arr){
        if(arr.length == 0 ){
            return Integer.MIN_VALUE;
        }
        int max = arr[0][0];
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                max = (arr[i][j] > max) ? arr[i][j] : max;
            }
        }
        return max;
    }
}
