public class MaximumOfAnArray {
    public static void main(String[] args) {
        int[] arr = {34,434,67,886,21,34,56,776,887,453};
        System.out.println(max(arr));
        System.out.println(max(arr,1,5));
    }
    static int max(int arr[]){
        if(arr == null){
            return -1;
        }
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans = (ans < arr[i]) ? arr[i] : ans;
        }
        return ans;
    }

//    finding the max in the range
    static int max(int arr[], int start, int end){
        if(arr.length == 0){
            return -1;
        }
        if(end < start){
           return -1;
        }
        int ans = arr[start];
        for (int i = start+1; i <= end; i++) {
            ans = (ans < arr[i]) ? arr[i] : ans;
        }
        return ans;
    }
}
