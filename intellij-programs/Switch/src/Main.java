import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Switch case lecture");


//        System.out.print("Enter a fruit name: ");
//        String fruit = read.next();

//        eg1 with normal syntax

//        switch(fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Rounded Fruit");
//                break;
//            default:
//                System.out.println("Invalid fruit");
//        }

//        eg 1 with enhanced syntax
//        switch(fruit){
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red fruit");
//            case "Orange" -> System.out.println("Rounded Fruit");
//            default -> System.out.println("Invalid fruit name");
//        }

        System.out.print("Enter a day: ");
        int day = read.nextInt();
//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }

        switch (day){
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}