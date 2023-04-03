import java.util.Scanner;

public class RemoveSubstringFromString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String string = read.nextLine();
        String str = read.nextLine();
//        System.out.println(removeSubString(string.toString(), str));
        System.out.println(string.replace(str,""));
    }
    static String removeSubString(String string, String str){
        if(string.isEmpty()) return "";
        if(string.startsWith(str)){
            return removeSubString(string.substring(str.length()), str);
        }else{
            return string.charAt(0) + removeSubString(string.substring(1), str);
        }
    }
}
