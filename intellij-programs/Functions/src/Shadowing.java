public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x); //90
        x = 9340;  // changing the x value globally
        int x;   // here local variable is created
        x =304;  // here the local variable is initialized
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
