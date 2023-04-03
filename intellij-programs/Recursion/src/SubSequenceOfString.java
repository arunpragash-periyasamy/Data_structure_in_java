import java.util.ArrayList;
import java.util.Scanner;
public class SubSequenceOfString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String string = read.next();
        System.out.println(subSequence1("", string));
    }
    static void subSequence(String ans, String string){
        if(string.isEmpty()){
                System.out.println(ans);
            return;
        }
        char ch = string.charAt(0);
        subSequence(ans + ch , string.substring(1));
        subSequence(ans, string.substring(1));
    }
    static ArrayList<String> subSequence1(String ans, String string){
        ArrayList<String> list = new ArrayList<>();
        if(string.isEmpty()){
            if(!ans.isEmpty()){
                list.add(ans);
            }
            return list;
        }
        char ch = string.charAt(0);
        list.addAll(subSequence1(ans + ch , string.substring(1)));
        list.addAll(subSequence1(ans, string.substring(1)));
        return list;
    }
}
