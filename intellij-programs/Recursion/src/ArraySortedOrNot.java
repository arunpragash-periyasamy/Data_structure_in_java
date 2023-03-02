import java.util.Scanner;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        if(sorted(array)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
    static boolean sorted(int[] array){
        return helper(array, 0);
    }
    static boolean helper(int[] array, int index){
        if(array.length - 1 == index) return true;
        return (array[index] < array[index + 1]) && helper(array, index + 1);
    }
}
