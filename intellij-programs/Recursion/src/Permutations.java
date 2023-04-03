import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Permutations {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String string = read.next();
        permutations("", string);
        System.out.println(list);
    }

    static void permutations(String process, String unProcess){
        if(unProcess.isEmpty()){
            list.add(process);
            return;
        }

        char ch = unProcess.charAt(0);
        for(int i = 0; i <= process.length(); i++){
            String first = process.substring(0 , i);
            String second = process.substring(i, process.length());
            permutations(first + ch + second , unProcess.substring(1));
        }
    }

}
