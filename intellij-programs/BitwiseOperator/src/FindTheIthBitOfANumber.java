import java.util.Scanner;

public class FindTheIthBitOfANumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Finding the i th bit of the given number");
        int number = read.nextInt();
        System.out.println("Enter the index to find the bit");
        int index = read.nextInt();
        System.out.println(findTheBit(number, index));
    }
    public static int findTheBit(int number, int index){
        return number & (1 << (index -1));
    }
}
