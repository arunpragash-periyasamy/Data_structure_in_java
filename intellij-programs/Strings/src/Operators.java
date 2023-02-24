import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println("Name: " + "Arunpragash");
        System.out.println("" + new ArrayList<>());
//        System.out.println(new Integer() + new ArrayList<>()); // This will produce an error
        System.out.println(new Integer(20) + "" + new ArrayList<>()); // it will print because there is a string so the ouput will be string
    }
}
