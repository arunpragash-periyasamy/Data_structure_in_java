import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Find the Lowercase or Uppercase");
        System.out.println("Enter a string: ");
        char ch = read.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The string starts with lowercase");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("The string starts with uppercase");
        }
        else{
            System.out.println("The given string is not starts with alphabetic");
        }
    }
}
