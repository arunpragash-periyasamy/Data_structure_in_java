public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println(a+" "+b);
    }
}
