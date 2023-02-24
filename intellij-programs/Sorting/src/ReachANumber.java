public class ReachANumber {
    public static void main(String[] args) {
        System.out.println(reachNumber(2));
    }

    public static int reachNumber(int target) {
        target = Math.abs(target);
        if(target == 0) return 0;
        int sum =0, steps = 0;
        while(sum < target){
            sum += steps;
            steps++;
        }

        while((sum - target) % 2 == 1){
            sum += steps;
            steps++;
        }

        return steps - 1;

    }
}
