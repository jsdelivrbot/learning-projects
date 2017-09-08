package solutions;

public class ShapeTester2 {
    public static void main(String[] args) {
        Rectangle3 rectangle = new Rectangle3(3, 60);
        Circle3 circle = new Circle3(5);

        int result = rectangle.compareTo(circle);

        if (result > 0) {
            System.out.println("Greater than");
        }
        else if (result < 0) {
            System.out.println("Less than");
        }
        else {
            System.out.println("Equal");
        }
    }
}
