//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class SubArrays {
//    public static void main(String[] args) {
//        Scanner read = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//        int n = read.nextInt();
//        int[] array = new int[n];
//        int sum = 0;
//        for (int i = 0; i < n; array[i] = read.nextInt(),i++);
//        for(int i = 0; i < n; i++){
//            int temp = sum;
//            sum += array[i];
//            sum = Math.max(sum, temp);
//        }
//        System.out.println(sum);
//    }
//}



import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; array[i] = read.nextInt(),i++);
        int ans = 0;
        for(int i = 0; i < n; i++){
            sum += array[i];
            ans = Math.max(ans, sum);
            if(sum <= 0) sum = 0;
        }
        System.out.println(ans);
    }
}
