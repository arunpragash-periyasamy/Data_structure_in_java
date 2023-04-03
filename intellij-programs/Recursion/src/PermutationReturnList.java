import java.util.ArrayList;
import java.util.Scanner;
public class PermutationReturnList {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String string = read.next();
        ArrayList<String> list = permutations("", string);
        System.out.println(list);
    }
    static ArrayList<String> permutations(String process, String unprocess){

        ArrayList<String> list = new ArrayList<>();
        if(unprocess.isEmpty()){
            list.add(process);
            return list;
        }

        char ch = unprocess.charAt(0);

        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0 , i);
            String second = process.substring(i, process.length());
            String str = first + ch + second;
            ArrayList<String> ans = permutations(str, unprocess.substring(1));
            list.addAll(ans);
        }
        return list;
    }
}
