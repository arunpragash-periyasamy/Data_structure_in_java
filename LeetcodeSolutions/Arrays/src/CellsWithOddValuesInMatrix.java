public class CellsWithOddValuesInMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];
        for(int i = 0; i < indices.length; i++){
            for(int j = 0; j < 2; j++){
                if(j == 0){
                    rowIncrement(arr, indices[i][j]);
                }else{
                    colIncrement(arr, indices[i][j]);
                }
            }
        }
        return oddCount(arr);
    }
    public void rowIncrement(int[][] arr, int row){
        for(int i = 0; i < arr[row].length; i++){
            arr[row][i] = ++arr[row][i];
        }
    }
    public void colIncrement(int[][] arr, int col){
        for(int i = 0; i < arr.length; i++){
            arr[i][col] = ++ arr[i][col];
        }
    }
    public int oddCount(int[][] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        CellsWithOddValuesInMatrix obj = new CellsWithOddValuesInMatrix();
        int[][] arr = {{40,5}};
        System.out.println(obj.oddCells(48,37, arr));
    }
}
