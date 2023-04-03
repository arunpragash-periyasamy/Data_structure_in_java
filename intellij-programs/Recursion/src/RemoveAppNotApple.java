import java.util.Scanner;
public class RemoveAppNotApple {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String string = read.nextLine();
        String replaceString = read.next();
        String preventString = read.next();
        System.out.println(removeString(string, replaceString, preventString));
    }
    static String removeString(String string, String replace, String prevent){
        if(string.isEmpty()) return "";
        if(string.startsWith(replace) && ! string.startsWith(prevent)){
            return removeString(string.substring(replace.length()), replace, prevent);
        }
        return string.charAt(0) + removeString(string.substring(1), replace, prevent);
    }
}
