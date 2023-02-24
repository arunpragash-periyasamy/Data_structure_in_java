import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {-1};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, k, nums.length-1);
        reverse(nums, 0, k-1);
    }
    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            nums[start] = nums[start] + nums[end];
            nums[end] = nums[start] - nums[end];
            nums[start] = nums[start] - nums[end];
            start++;
            end--;
        }
    }
}
