import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int row = read.nextInt();
        printingPattern(row, 0);
    }
    static void printingPattern(int row, int col){
        if(row == 0) return;
        if(col < row){
            printingPattern(row, ++col);
            System.out.print("* ");
        }else{
            printingPattern(--row, 0);
            System.out.println();
        }
    }
}
