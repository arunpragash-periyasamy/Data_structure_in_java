import java.util.Arrays;
public class MazeTraceThePath {
    public static void main(String[] args){
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] path = new int[maze.length][maze.length];
        mazeList(maze, 0, 0, "", path, 1);
    }
    static void mazeList(boolean[][] maze, int row, int column, String process,int[][] path, int step){
        int row_size = maze.length - 1;
        int col_size = maze[0].length - 1;
        if(row == row_size && column == col_size){
            path[row][column] = step;
            for (int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(process);
            System.out.println();
            return;
        }

        if(!maze[row][column]) return;

        maze[row][column] = false;
        path[row][column] = step;

        if(row != row_size){
            mazeList(maze, row + 1, column, process + "D", path, step + 1);

        }

        if(column != col_size){
            mazeList(maze, row, column + 1, process + "R", path, step + 1);
        }

        if(row != 0){
            mazeList(maze, row - 1, column, process + "U", path, step + 1);
        }

        if(column != 0){
            mazeList(maze, row, column - 1, process + "L", path, step + 1);
        }
        path[row][column] = 0;
        maze[row][column] = true;
    }
}
