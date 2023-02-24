import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(findDuplicates(arr));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        sorting(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] != i+1){
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void sorting(int[] arr){
        int start = 0;
        while(start < arr.length){
            int correct = arr[start] - 1;
            if(arr[correct] != arr[start]){
                swap(arr, start, correct);
            }else{
                start++;
            }
        }
    }
    public static void swap(int[] arr, int start, int end){
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
    }
}
