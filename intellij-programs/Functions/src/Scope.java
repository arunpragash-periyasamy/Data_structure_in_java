public class Scope {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 303;
        {
            a = 2032;       // a will be reassigned it will change the original value
            int c = 292;   // c will be initialized ,and it will be accessed only inside this block
            System.out.println(c);
        }
        System.out.println(a);
    }
}
