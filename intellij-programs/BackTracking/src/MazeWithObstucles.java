import java.util.Scanner;
import java.util.ArrayList;
public class MazeWithObstucles {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}};
        mazeList(maze, 0, 0, maze.length - 1, "");
        System.out.println(list);
    }
    static ArrayList<String> list = new ArrayList<>();
    static void mazeList(boolean[][] maze, int row, int column, int size, String process){
        if(row == size && column == size){
            list.add(process);
            return;
        }
        if(maze[row][column] == false){
            return;
        }

        if(row != size){
            mazeList(maze, row + 1, column, size, process + "D");
        }

        if(column != size){
            mazeList(maze, row, column + 1, size, process + "R");
        }
    }
}
