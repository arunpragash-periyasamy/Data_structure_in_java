import java.util.Scanner;

public class StringPalindrome {
    public static boolean CheckPalindrome(String string){
        String reverseString="";
        for(int i=string.length()-1;i>=0;i--){
            reverseString += string.charAt(i);
        }
        if(string.equals(reverseString)) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("Checking String Palindrome");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = read.nextLine();
        boolean check = CheckPalindrome(string.toLowerCase());
        if(check){
            System.out.println("The Given String is a palindrome");
        }
        else{
            System.out.println("The given String is not a palindrome");
        }
    }
}
