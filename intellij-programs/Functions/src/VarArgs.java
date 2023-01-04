import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,34,5,48,394,342,324,322);
        stringfun("ssk","dijs","djsiuj","asuha","uhwuw","dikmmax");
    }
    static void fun(int ...arr){
        System.out.println(Arrays.toString(arr));
    }
    static void stringfun(String ...hello){
        System.out.println(Arrays.toString(hello));
    }
}
