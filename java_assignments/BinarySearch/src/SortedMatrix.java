import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
                };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }else if(matrix[row][mid] > target){
                colEnd = mid - 1;
            }else{
                colStart = mid + 1;
            }
        }
        return new int[]{-1, -1};
    }
    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int column = matrix.length-1;

//        if the given matrix is contain only one row then perform normal binary search
        if(row == 1){
            return binarySearch(matrix, 0, 0, column,target);
        }

        int rowStart = 0;
        int rowEnd = row-1;
        int colMid = column / 2;

//        loop will be run until there is only two rows.
        while(rowStart < rowEnd){
            int mid = rowStart + (rowEnd - rowStart) /2;
//            if the middle element is equal to target then return the index
            if(matrix[mid][colMid] == target){
                return new int[]{mid, colMid};
            }
//            if the middle element is smaller than the target then ignore the above rows
            else if(matrix[mid][colMid] < target){
                rowStart = mid;
            }
//            if the middle element is greater than the target then ignore the below rows
            else{
                rowEnd = mid;
            }
        }

//        now there will be only two rows. now check the middle column contains the target or not

//        now check the first row's middle column element which is currently presenting row
        if(matrix[rowStart][colMid] == target){
            return new int[]{rowStart, colMid};
        }
//        now check the first row's middle column element which is currently presenting row
        else if(matrix[rowStart + 1][colMid] == target){
            return new int[]{rowStart + 1, colMid};
        }

//        now check the first part
        if(matrix[rowStart][colMid - 1] >= target && matrix[rowStart][0] <= target){
            return binarySearch(matrix, rowStart, 0, colMid, target);
        }
//        now check the second part
        if(matrix[rowStart][colMid + 1] <= target && matrix[rowStart][column-1] >= target){
            return binarySearch(matrix, rowStart, colMid - 1, column - 1, target);
        }
//        now check the third part
        if(matrix[rowStart + 1][colMid - 1] >= target && matrix[rowStart + 1][0] <= target){
            return binarySearch(matrix, rowStart + 1, 0, colMid -1, target);
        }
//        now check the fourth part
//        else(matrix[rowStart + 1][colMid + 1] <= target && matrix[rowStart + 1][column - 1] >= target){
            return binarySearch(matrix, rowStart + 1, colMid + 1, column - 1, target);
//        }
//        return new int[]{-1,-1};
    }

}
