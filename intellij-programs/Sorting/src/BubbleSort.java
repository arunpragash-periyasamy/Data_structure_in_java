import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] array){
        for(int i = 0; i < array.length; i++){
            boolean swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if(array[j-1] > array [j]){
                    array[j-1] = array[j-1] + array[j];
                    array[j] = array[j-1] - array[j];
                    array[j-1] = array[j-1] - array[j];
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }
}
