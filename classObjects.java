class Car{
    public void breakCar(String car){
        System.out.println(car + " applies break");
    }
    public void steerRight(int degree){
        System.out.println("The car turn "+degree+" degree right side");
    }
    public void steerLeft(int degree){
        System.out.println("The car turn "+degree+" degree left side");
    }
}

public class classObjects{
    public static void main(String[] a){
        Car ford = new Car();
        ford.breakCar("ford");
        ford.steerLeft(15);
        ford.steerRight(20);
        System.out.println("This is the concept of creating a object classes using car.");
    }
}
