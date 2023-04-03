import java.util.Scanner;
import java.util.ArrayList;
public class MazeListDiagonal {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        ArrayList<String> list = mazeListDiagonal(n, n, "");
        System.out.println(list);
    }

    static ArrayList<String> mazeListDiagonal(int row, int column, String process){
        if(row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(process);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row != 1)
            list.addAll(mazeListDiagonal(row - 1, column, process + "D"));
        if(column != 1)
            list.addAll(mazeListDiagonal(row, column - 1, process + "R"));
        if(row != 1 && column != 1)
            list.addAll(mazeListDiagonal(row - 1, column -1, process + "d"));
        return list;
    }
}
