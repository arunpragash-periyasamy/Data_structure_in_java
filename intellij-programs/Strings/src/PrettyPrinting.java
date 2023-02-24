public class PrettyPrinting {
    public static void main(String[] args) {
//        format to print the float with 2 decimal values
        float val = 2424.3234f;
        System.out.printf("The float with two decimal values : %.2f",val);

//        format the Math.PI with three decimals
        System.out.printf("\nMath PI value is %.3f\n",Math.PI);

//        format specifiers for the string
        System.out.printf("My name is %s and I am %s","Arun","a Software Developer");
    }
}
