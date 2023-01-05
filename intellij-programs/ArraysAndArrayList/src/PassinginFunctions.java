import java.util.Arrays;
public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {23,45,3,5,3,5};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int nums[]){
        nums[3] = 244;
    }
}
