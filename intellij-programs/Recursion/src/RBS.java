import java.util.Scanner;

public class RBS {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        int target = read.nextInt();
         System.out.println(binarySearch(array, target, 0, size - 1));
    }
    static int binarySearch(int[] array, int target, int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(array[mid] == target) return mid;

        if(array[start] <= array[mid]){
            if(array[start] <= target && array[mid] >= target){
                return binarySearch(array, target, start, mid - 1);
            }else{
                return binarySearch(array, target, mid + 1, end);
            }
        }

        if(target >= array[mid] && target <= array[end]){
            return binarySearch(array, target, mid + 1, end);
        }
        return binarySearch(array, target, start, mid-1);
    }
}
