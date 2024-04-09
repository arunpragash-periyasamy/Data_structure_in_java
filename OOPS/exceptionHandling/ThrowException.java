public class ThrowException {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        try{
            System.out.println(divide(a,b));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Normal Exception");
        }
        finally{
            System.out.println("This part will run either try block works or catch block works");
        }

        try{
            throw new MyException("My Exception");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Normal Exception");
        }
        finally{
            System.out.println("This is the check for the our own exception class");
        }
    }
    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("second value should not be zero");
        }
        return a/b;
    }
}
