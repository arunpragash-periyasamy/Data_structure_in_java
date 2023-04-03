import java.util.ArrayList;
import java.util.Scanner;
public class MazeList {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = read.nextInt();
        mazeList(n, n, "", list);
        System.out.println(list);
    }

    static void mazeList(int row, int column, String process, ArrayList<String> list){

        if(row == 1 && column == 1){
            list.add(process);
        }
        String str = "";
        if(row != 1){
            str = process + "D";
            mazeList(row -1 , column, str , list);
        }

        if(column != 1){
            str = process + "R";
            mazeList(row, column - 1, str, list);
        }

    }
}
