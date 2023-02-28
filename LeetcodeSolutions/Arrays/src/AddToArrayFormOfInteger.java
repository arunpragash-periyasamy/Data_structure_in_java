import java.util.ArrayList;
import java.util.List;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 1;
        AddToArrayFormOfInteger obj = new AddToArrayFormOfInteger();
        System.out.println(obj.addToArrayForm(arr,k).toString());
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>(num.length);
        long sum = sumOfArray(num);
        sum += k;
        while(sum > 0){
            int last = (int)(sum % 10);
            list.add(0, last);
            sum = sum/10;
        }
        return list;
    }
    long sumOfArray(int[] nums){
        long sum = 0;
        for(int num : nums){
            sum = (sum * 10) + num;
        }
        return sum;
    }
}
