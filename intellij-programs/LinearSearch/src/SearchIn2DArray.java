import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding the element in the 2d array");
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
        System.out.print("Enter the target element to search: ");
        int target = read.nextInt();
        if(linearSearch2DArray(arr, target)){
            System.out.println("Element found in the array :)");
        }else{
            System.out.println("Element not found in the array :(");
        }
        int[] ans = linearSearch2DArrayReturnArray(arr, target);
        System.out.println("Index : " + Arrays.toString(ans));
    }
    static boolean linearSearch2DArray(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target) return true;
            }
        }
        return false;
    }

    static int[] linearSearch2DArrayReturnArray(int[][] arr, int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target) return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
