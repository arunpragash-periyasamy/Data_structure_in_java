import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int size = read.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = read.nextInt();
        }
        int target = read.nextInt();
        System.out.println(linearSearch(array, target, 0));
    }
    static int linearSearch(int[] array, int target, int index){
        if(array[index] == target) return index + 1;
        if(index == array.length -1) return -1;
        return linearSearch(array, target, ++index);
    }
}
