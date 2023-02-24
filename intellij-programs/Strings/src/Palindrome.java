import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Check whether the string is a palindrome or not");
        System.out.print("Enter a string : ");
        String a = read.nextLine();
        System.out.println(checkPalindrome(a));
    }
    static boolean checkPalindrome(String a){
        a = a.toLowerCase(); // convert to lowercase for case check case-insensitive
        int start = 0;
        int end = a.length()-1;
        while(start <= end){
            if(a.charAt(start) != (a.charAt(end))){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
