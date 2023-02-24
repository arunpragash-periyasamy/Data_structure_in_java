public class Comparison {
    public static void main(String[] args) {
        String a = "Arun";
        String b = "Arun";
//        System.out.println(a==b);

        String name1 = new String("Arun");
        String name2 = new String("Arun");
        System.out.println("comparing the objects : " + (name1 == name2));
        System.out.println("comparing the values : " + (name1.equals(name2)));
    }
}
