import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding character in a String using linear Search");
        System.out.print("Enter a string: ");
        String str = read.nextLine();
        System.out.print("Enter a character to search: ");
        char ch = read.next().charAt(0);
        boolean check = linearSearch2(str, ch);
        System.out.println(check);
    }

//    linear search using for loop and return boolean
    static boolean linearSearch(String str, char ch){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }

//    linear search using foreach loop and return boolean
    static boolean linearSearch2(String str, char ch){
        for(char c : str.toCharArray()){
            if(c == ch){
                return true;
            }
        }
        return false;
    }
}
