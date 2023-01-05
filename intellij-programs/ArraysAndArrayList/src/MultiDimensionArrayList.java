import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//        initialization
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<Integer>());
        }

//        adding elements

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(read.nextInt());
            }
        }

        System.out.println(list);
    }
}
