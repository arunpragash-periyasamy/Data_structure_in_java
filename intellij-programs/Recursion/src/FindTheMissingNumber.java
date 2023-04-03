import java.util.Scanner;
import java.util.Arrays;
public class FindTheMissingNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        int[] difference = new int[size - 1];
        int D = 0;
        for (int i = 0; i < size; array[i] = read.nextInt(), i++);


        for(int i = 0; i < size - 1; i++){
            difference[i] = array[i + 1] - array[i];
            if(i != 0 && difference[i] == difference[i - 1]){
                D = difference[i];
            }
        }

        
        for(int i = 0; i < size; i++){
            if((array[i] + D) != array[i +1]){
                System.out.println(array[i] + D);
                return;
            }
        }

    }
}
