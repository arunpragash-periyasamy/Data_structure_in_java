import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class SetColorsSlidingWindow {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; array[i] = read.nextInt(), i++);
        int l = 0;
        int i = 0;
        int r = n - 1;
        while(i < r){
            if(array[i] == 0){
                if(array[i] < array[l]){
                    array[i] = array[l] ;
                }
                array[l] = 0;
                l++;
            }
            else if(array[i] == 2){
                if(array[i] != array[r] ){
                    array[i] = array[r];
                }
                array[r] = 2;
                r--;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
