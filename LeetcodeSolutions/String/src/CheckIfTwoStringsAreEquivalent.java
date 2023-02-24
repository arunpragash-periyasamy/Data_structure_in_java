//1662 https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
/*
* Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
* Output: true
*
* Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
* Output: false
*
* Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
* Output: true
*
* */
public class CheckIfTwoStringsAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "cb"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(String str : word1){
            str1.append(str);
        }
        for(String str : word2){
            str2.append(str);
        }
        if(str1.toString().equals(str2.toString())){
            return true;
        }
        return false;
    }
}
