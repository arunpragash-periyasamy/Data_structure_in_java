public class maximumProductOfTwoElements {
    public static void main(String[] args) {
        int[] arr = {10,2,5,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        sort(nums);
        int ans = ((nums[nums.length-1] - 1) * (nums[nums.length-2] - 1));
        return ans;

    }
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - i - 1;
            int max = findMax(arr, 0, lastIndex);
            if(max != lastIndex){
                swap(arr, max, lastIndex);
            }
        }
    }
    public static int findMax(int[] arr, int start, int end){
        int max = 0;
        for(int i = 1; i <= end; i++){
            if(arr[max] < arr[i]) max = i;
        }
        return max;
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
