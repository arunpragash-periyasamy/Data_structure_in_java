import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Arun Pragash";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.split(" "));
        System.out.println("  name  ".strip());
        System.out.println(name.indexOf('a'));
        System.out.println(name.toUpperCase());
        System.out.println(name.repeat(3));
    }
}
