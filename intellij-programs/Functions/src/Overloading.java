import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun();
        fun(3,56,65);
        fun("idmnkfdm","imdsk","iojiejw");
    }
    static void fun(){
        System.out.println("Without any arguments");
    }
    static void fun(int ...v){
        System.out.println("With integer arguments");
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println("With String arguments");
        System.out.println(Arrays.toString(v));
    }
}
