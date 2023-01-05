import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {34,434,67,886,21,34,56,776,887,453};
        swap(arr, 4, 8);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int a[], int b, int c){
        a[b] = a[b] + a[c];
        a[c] = a[b] - a[c];
        a[b] = a[b] - a[c];
    }
}
