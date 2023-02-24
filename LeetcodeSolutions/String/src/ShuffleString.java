// 1528 https://leetcode.com/problems/shuffle-string/
/*
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Input: s = "abc", indices = [0,1,2]
 * Output: "abc"
*
* */
public class ShuffleString {
    public static void main(String[] args) {
//        String str = "codeleet";
//        int[] arr = {4,5,6,7,0,2,1,3};
        String str = "abc";
        int[] arr = {0,1,2};
        System.out.println(restoreString(str, arr));
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder builder = new StringBuilder();
        char[] ch = new char[indices.length];
        for(int i = 0; i < indices.length; i++){
            ch[indices[i]] = s.charAt(i);
        }
        for(int i =0; i < ch.length; i++){
            builder.append(ch[i]);
        }
        return builder.toString();
    }
}
