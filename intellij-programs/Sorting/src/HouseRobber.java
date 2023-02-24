import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {2,1,1,2};
        System.out.println(rob(arr));
    }
    public static int rob(int[] nums) {
        int[] ans = new int[nums.length + 1];
        ans[0] = 0;
        ans[1] = nums[0];
        for(int i = 1; i < nums.length; i++){
            int value = ans[i - 1] + nums[i];
            ans[i + 1] = Math.max(ans[i], value);
        }
        return ans[ans.length-1];
    }
}
