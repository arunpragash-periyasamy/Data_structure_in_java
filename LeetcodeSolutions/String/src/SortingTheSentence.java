public class SortingTheSentence {
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(str));
    }
    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] res = new String[str.length];
        for(String string : str){
            int index = (int)(string.charAt(string.length() - 1) - '0');
            res[index - 1] = string.substring(0, string.length() - 1);
        }
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < res.length; i++){
            builder.append(res[i]);
            if(i != res.length - 1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
