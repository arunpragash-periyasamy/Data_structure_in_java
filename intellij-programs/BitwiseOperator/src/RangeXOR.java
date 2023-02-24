import java.util.Scanner;

public class RangeXOR {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        int b = read.nextInt();
        System.out.println(resultXor(b));
    }

//    function to calculate xor from 0 to a
    static int resultXor(int a){
        int ans = 0;
        switch(a%4){
            case 0 -> {
                return a;
            }
            case 1 -> {
                return 1;
            }
            case 2 -> {
                return a + 1;
            }
        }
        return 0;
    }
}
