public class Conditionals {
    public static void main(String[] args) {
        int salary = 25400;

//        if-else condition

//        if(salary > 10000){
//            salary = salary+2000;
//        }
//        else{
//            salary = salary+1000;
//        }
//        System.out.println(salary);

//        nested else if

        if(salary > 20000){
            salary += 3000;
        }else if(salary > 10000){
            salary += 2000;
        }else{
            salary += 1000;
        }

        System.out.println(salary);

    }
}