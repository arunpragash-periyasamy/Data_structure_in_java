//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
/*
*
* Input: candies = [2,3,5,1,3], extraCandies = 3
* Output: [true,true,true,false,true]
*
* Input: candies = [4,2,1,1,2], extraCandies = 1
* Output: [true,false,false,false,false]
*
* Input: candies = [12,1,12], extraCandies = 10
* Output: [true,false,true]
*
* */
import java.util.ArrayList;
import java.util.List;
public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        KidsWithTheGreatestNumberOfCandies object = new KidsWithTheGreatestNumberOfCandies();
        int[] array = {12,1,12};
        System.out.println(object.kidsWithCandies(array, 10).toString());
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>(candies.length);
        for(int i = 0; i < candies.length; i++){
            int max = candies[i] + extraCandies;
            boolean check = true;
            for(int j = 0; j < candies.length; j++){
                if(max < candies[j]){
                    check = false;
                    break;
                }
            }
            list.add(check);
        }
        return list;
    }
}
