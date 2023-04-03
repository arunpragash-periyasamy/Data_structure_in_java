import java.util.ArrayList;
public class MazeAllPaths {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] a){
        MazeAllPaths obj = new MazeAllPaths();
        boolean[][] maze= {
                {true, true, true, true},
                {true, true, false, true},
                {true, true, true, true},
                {true, true, false, true},
        };
        mazeList(maze, 0, 0, "");
        System.out.println(list);
    }

    static void mazeList(boolean[][] maze, int row, int column, String process){
        int size = maze.length - 1;

        if(row == size && column == size){
            MazeAllPaths obj = new MazeAllPaths();
            list.add(process);
            return;
        }

        if( !maze[row][column] ){
            return;
        }

        maze[row][column] = false;

        if(row != size){
            mazeList(maze, row + 1, column, process + "D");
        }

        if(column != size){
            mazeList(maze, row, column + 1, process + "R");
        }

        if(row != 0){
            mazeList(maze, row - 1, column, process + "U");
        }

        if(column != 0){
            mazeList(maze, row, column - 1, process + "L");
        }

        maze[row][column] = true;
    }

}
