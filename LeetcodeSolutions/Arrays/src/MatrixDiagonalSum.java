public class MatrixDiagonalSum {
    public static void main(String[] args) {
        MatrixDiagonalSum obj = new MatrixDiagonalSum();
        int[][] mat = {{7,3,1,9},{3,4,6,9},{6,9,6,6},{9,5,8,5}};
        System.out.println(obj.diagonalSum(mat));
    }
    public int diagonalSum(int[][] mat) {
        return leftToRightSum(mat) + rightToLeftSum(mat);
    }
    public int leftToRightSum(int[][] mat){
        int sum = 0;
        for(int row = 0, col = 0; row < mat.length; row++, col++){
            sum += mat[row][col];
        }
        return sum;
    }
    public int rightToLeftSum(int[][] mat){
        int sum = 0;
        for(int row = 0, col = mat.length - 1;  row < mat.length; row++, col--){
            sum += mat[row][col];
        }
        if(mat.length%2 != 0){
            int center = mat.length/2;
            sum -= mat[center][center];
        }
        return sum;
    }
}
