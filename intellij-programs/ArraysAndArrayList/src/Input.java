import java.util.Arrays;
import java.util.Scanner;

public class Input {
    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayObjects();
//        ArrayPrimitives();
    }
    static  void ArrayPrimitives(){

        //        Types of array ini ftialization;

        //        Array of primitives
        int[] arr = {3453,45,535,3224,455};

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int[] array = new int[5];
        array[0] = 345;
        array[1] = 884;
        array[2] = 985;
        array[3] = 612;
        array[4] = 654;

        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("");
        System.out.println("Enter the elements of an array");
        for (int i = 0; i < 5; i++) {
            arr[i] = read.nextInt();
        }
        System.out.println("For each loop");
//        for - each loop

        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println("");
    }

    static void ArrayObjects(){

//        Array of Object
        String[] str = new String[4];

        System.out.println("Enter array strings: ");
        for(int i = 0; i < str.length; i++ ){ // .length is predefined method to find the length of the array
            str[i] = read.next();
        }
        System.out.println(Arrays.toString(str)); // Arrays.toString() is method to convert arrays to string
    }
}
