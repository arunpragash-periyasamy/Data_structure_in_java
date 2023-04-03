import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        int[] arr = new int[26];
        for(char a : str.toCharArray()){
            if(a >= 'a' && a <= 'z'){
                arr[a-'a'] = arr[a - 'a'] +1;
            }
            if(a >= 'A' && a <= 'Z'){
                arr[a - 'A'] = arr[a - 'A'] + 1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i] !=  0)
            System.out.println((char)('A' + i ) + " : " + arr[i]);
        }
    }
}
