import java.util.Arrays;

public class MergeSortedArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i = m, j = 0; i < m + n ; i++, j++){
                nums1[i] = nums2[j];
            }
            Arrays.sort(nums1);
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,0,0,0};
        int[] nums1 = {2,5,6};
        merge(nums,3,nums1,3);
        System.out.println(Arrays.toString(nums));
    }
}
