public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(Fibo(6));
        System.out.println(fiboFormula(6));
    }
    static int fiboFormula(int n){
        return (int)(Math.pow((1 + Math.sqrt(5))/2, n) / Math.sqrt(5));
    }
    static int Fibo(int n){
        if(n < 2){
            return n;
        }
        return Fibo(n-1) +  Fibo(n-2);
    }
}
