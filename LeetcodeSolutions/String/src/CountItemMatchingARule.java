import java.util.ArrayList;
import java.util.List;
//1773 https://leetcode.com/problems/count-items-matching-a-rule/
/*
* Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
* Output: 1
*
* Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
* Output: 2
*
* */
public class CountItemMatchingARule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> list = new ArrayList<>();
            list.add("phone");
            list.add("blue");
            list.add("pixel");
        items.add(list);
        list.clear();
            list.add("computer");
            list.add("silver");
            list.add("phone");
        items.add(list);
        list.clear();
            list.add("phone");
            list.add("gold");
            list.add("iphone");
        items.add(list);
        System.out.println(items.toString());
        System.out.println(countMatches(items, "color", "gold"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int column = 0;
        if(ruleKey.equals("color")){
            column = 1;
        }else if(ruleKey.equals("name")){
            column = 2;
        }
        int count = 0;
        for(List list : items){
            if(list.get(column).equals(ruleValue)) count++;
        }
        return count;
    }
}
