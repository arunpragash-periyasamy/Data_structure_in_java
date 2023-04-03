
import java.util.Scanner;
import java.util.ArrayList;
public class SubSetRevision {
    public static void main(String[] arguments){
        Scanner read = new Scanner(System.in);
        int arraySize = read.nextInt();
        int[] array = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            array[i] = read.nextInt();
        }
        int k = read.nextInt();
        for(ArrayList<Integer> list: subset(array, k)){
            System.out.println(list);
        }
    }
    static ArrayList<ArrayList<Integer>> subset(int[] array, int k){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<Integer>());
        for(int number : array){
            int size = list.size();
            for (int i = 0; i < size; i++){
                ArrayList<Integer> innerList = new ArrayList<>(list.get(i));
                innerList.add(number);
                list.add(innerList);
            }
        }

        int i = 0;
        while(i < list.size()){
            ArrayList<Integer> l = list.get(i);
            if(l.size() != k){
                list.remove(l);
            }else{
                i++;
            }
        }

        return list;

    }
}
