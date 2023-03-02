import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Factors object = new Factors();
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        object.factors3(n);
    }

//    time complexity : O(n)
    void factors1(int n){
        for(int i = 1; i <= 20/2; i++){
            if(20 % i == 0){
                System.out.print(i + " ");
            }
        }
    }

//    time complexity : O(sqrt(n))

    void factors2(int n){
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i == (n/i)){
                    System.out.println(i);
                }else{
                    System.out.print(i + " " + (n/i) + " ");
                }
            }
        }
    }


    void factors3(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                if(i == (n/i)){
                    System.out.print(i + " ");
                }else{
                    System.out.print(i + " ");
                    list.add(0,n/i);
                }
            }
        }
        for (int i : list) {
            System.out.print(i + " ");

        }
    }
}
