import java.util.Scanner;
public class MazeTry {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        System.out.println(mazeCount(n, n));
    }
    static int mazeCount(int row, int column){
        if(row == 1 && column == 1){
            return 1;
        }
        int count = 0;
        if(row != 1)
            count = count + mazeCount(row -1, column);
        if(column != 1)
            count = count + mazeCount(row, column - 1);
        return count;
    }
}
