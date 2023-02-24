import java.util.Scanner;
public class GettingInputAsGraph {

    static int findmin(boolean[] vis, int[] res){
        int minvertes = -1;
        for (int i = 0; i < res.length; i++) {
            if(vis[i] == false && minvertes == -1){
                int dis =
                        ;
            }
        }
        return -1;
    }

    static void path(int[][] adj){
        int v = adj.length;
        boolean[] vis = new boolean[v];
        int[] res = new int[v];
        res[0] = 0;
        for(int i = 0; i < v; i++){
            res[i] = Integer.MIN_VALUE;
        }
        for (int i = 0; i < v; i++) {
            int minvertex = findmin(vis, res);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int vertices = read.nextInt();
        int[][] array = new int[vertices][vertices];
    }
}
