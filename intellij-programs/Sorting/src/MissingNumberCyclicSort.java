import java.util.Arrays;

public class MissingNumberCyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int missingNumber(int[] nums) {
        int start = 0;
        while(start < nums.length){
            int correct =  nums[start] - 1;
            if(correct >= 0 && nums[start] != nums[correct]){
                swap(nums, start, correct);
            }else{
                start++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }
    public static void swap(int[] nums, int start, int end){
        nums[start] = nums[start] + nums[end];
        nums[end] = nums[start] - nums[end];
        nums[start] = nums[start] - nums[end];
    }
}
