import java.util.Scanner;
public class RemoveCharacterFromString {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder string = new StringBuilder(read.next());
        StringBuilder ans = new StringBuilder("");
        System.out.print("Enter a character : ");
        char character = read.next().trim().charAt(0);
//        for(int i =0; i < string.length(); i++){
//            if(string.charAt(i) != character){
//                ans.append(string.charAt(i));
//            }
//        }
//        removeCharacter(string, character, 0);
//        removeCharacter1(ans, string, character);
//        System.out.println(ans);
        System.out.println(removeCharacter2(string.toString(), character));
    }

    static String removeCharacter2(String string, char ch){
        if(string.isEmpty()){
            return "";
        }
        if(ch != string.charAt(0)){
            return string.charAt(0) + removeCharacter2(string.substring(1), ch);
        }
        return removeCharacter2(string.substring(1), ch);
    }

    static void removeCharacter1(StringBuilder ans, StringBuilder string, char ch){
        if(string.isEmpty()){
            return;
        }
        if(ch != string.charAt(0)){
            ans.append(string.charAt(0));
        }
        string.deleteCharAt(0);
        removeCharacter1(ans, string, ch);
    }

    static void removeCharacter(StringBuilder str, char ch, int start){
        if(str.length() == start){
            return;
        }
        if(str.charAt(start) == ch){
            str.deleteCharAt(start);
        }else{
            ++start;
        }
        removeCharacter(str, ch, start);
    }

}
