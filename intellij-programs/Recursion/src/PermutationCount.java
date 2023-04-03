import java.util.Scanner;
public class PermutationCount {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String string = read.next();
        System.out.println(permutations("", string));
    }
    static int permutations(String process, String unprocess){
        if(unprocess.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = unprocess.charAt(0);
        unprocess = unprocess.substring(1);
        for (int i = 0; i <= process.length(); i++) {
            String first = process.substring(0, i);
            String second = process.substring(i, process.length());
            String str = first + ch + second;
            count += permutations(str, unprocess);
        }
        return count;
    }
}
