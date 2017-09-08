package examples;

public class Relate {
    public static void main(String[] args) {
        int speed = 35;
        int speedLimit = 30;

        System.out.println("speed: " + speed);
        System.out.println("speedLimit: " + speedLimit);

        boolean result = speed < speedLimit;
        System.out.print("speed < speedLimit results in ");
        System.out.println(result);

        result = speed > speedLimit;
        System.out.print("speed > speedLimit results in ");
        System.out.println(result);
    }
}
