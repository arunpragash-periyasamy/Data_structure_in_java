public class KthMissingPoisitiveInteger {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k =5;
        findKthPositive(arr,k);
    }
    public static int findKthPositive(int[] arr, int k) {
        int start = 0, end =arr.length;
        while(start < end){
            int mid = start + (end-start)/2;
            int ans = arr[mid] - mid -1;
            if(ans < k) start = mid + 1;
            else end = mid;
        }
        return start + k;
    }
}
