import java.util.Scanner;
public class NoCeil{
    public static void main(String [] a){
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = read.nextInt();
        int ceil = 0;
        int [] array = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++){
            array[i] = read.nextInt();
        }
        System.out.println("Enter the element: ");
        int target = read.nextInt();
        int start=0,end=size-1,temp;
        boolean isCeil = true;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(array[mid]==target && mid+1 != size){
                ceil =array[mid+1];
                isCeil = false;
                break;
            }
            else if(target<array[mid]){
                end = mid-1;
                ceil = mid;
                isCeil = false;
            }
            else if(target>array[mid]){
                start = mid+1;
            }
            else if (mid+1 == size){
                if(target<array[mid]){
                    ceil = mid;
                    isCeil = false;
                }
            }
        }
        System.out.print("While loop  ended");
        if(isCeil){
            System.out.println("No Ceil");
        }
        else{
            System.out.println(array[ceil]);
        }
    }
}