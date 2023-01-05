import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < 7; i++){
            list.add(read.nextInt());
        }
        System.out.println("list : " + list);
        System.out.println("list.contains(234) : " + list.contains(234));
        System.out.println("list.set(3,5432) : " + list.set(3,5432));
        System.out.println("list.get(4) : " + list.get(4));
        System.out.println("list.remove(5) : " + list.remove(5));
        System.out.println("list.clone() : " + list.clone());
        System.out.println("list.isEmpty() : " + list.isEmpty());

    }
}
