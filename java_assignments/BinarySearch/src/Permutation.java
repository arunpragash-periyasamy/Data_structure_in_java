import java.util.ArrayList;

public class Permutation {
    private static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {
        String string = "abc";
        getPermutation(string);
        displayList();
    }

    private static void displayList() {
        System.out.println(list);
    }

    private static void getPermutation(String string) {
        getPermutation(string, new StringBuilder());
    }

    private static void getPermutation(String string, StringBuilder result) {
        if (string.isEmpty()) {
            list.add(result.toString());
            return;
        }
        char ch = string.charAt(0);
        int length = result.length();
        for (int i = 0; i <= length; i++) {
            result.insert(i, ch);
            getPermutation(string.substring(1), result);
            result.deleteCharAt(i);
        }
    }
    
}
