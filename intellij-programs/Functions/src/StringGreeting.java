import java.util.Scanner;

public class StringGreeting {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your name: ");
//        String message = greet();


        String name = read.next();
        String message = myGreet(name);
        System.out.println(message);
    }

    static String myGreet(String name) {
        String message = "Hello "+name;
        return message;
    }

    static  String greet(){
        String greet = "How are you?";
        return greet;
    }
}
