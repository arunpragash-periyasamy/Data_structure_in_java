//1704 https://leetcode.com/problems/determine-if-string-halves-are-alike/
/*
* Input: s = "book"
* Output: true
*
* Input: s = "textbook"
* Output: false
*
* */
public class DetermineIfStringHalvesAreAlike {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
    public static boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2 , s.length());
        int count1 = counting(s1);
        int count2 = counting(s2);
        return (count1 == count2);
    }
    public static int counting(String str){
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }
//    public static boolean halvesAreAlike(String s) {
//        s = s.toLowerCase();
//        return (counting(s.substring(0, s.length()/2)) == counting(s.substring(s.length()/2 , s.length())));
//    }
//    public static int counting(String str){
//        int count = 0;
//        for(char ch : str.toCharArray()){
//            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                count++;
//            }
//        }
//        return count;
//    }
}
