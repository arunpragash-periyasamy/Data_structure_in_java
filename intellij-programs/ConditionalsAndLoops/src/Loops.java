import  java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
//        for(int i=0; i < 3; System.out.println("Hello World"),i++){
//
//        }

//        for loop to print 1 to 5

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }


//        for loop for print 1 to N numbers

//        Scanner read = new Scanner(System.in);
//        System.out.print("Enter a number to print 1 to N numbers: ");
//        int number =read.nextInt();
//        for (int index = 1; index <= number; index++) {
//            System.out.print(index+" ");
//        }


//        while loop
//        Scanner read = new Scanner(System.in);
//        System.out.print("Enter a number to print 1 to N numbers: ");
//        int number =read.nextInt();
//        int i=1;
//        while(i<=number){
//            System.out.print(i+" ");
//            i++;
//        }


//        do while

        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number to print 1 to N numbers: ");
        int number =read.nextInt();
        int i=1;
        do{
            System.out.print(i+" ");
        }while(i<=number);
    }
}
