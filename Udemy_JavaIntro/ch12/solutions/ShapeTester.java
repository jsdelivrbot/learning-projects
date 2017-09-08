package solutions;

public class ShapeTester {
    public static void main(String[] args) {
        Shape1[] shapes = new Shape1[3];

        shapes[0] = new Rectangle1(3, 60);
        shapes[1] = new Rectangle1(6, 4);
        shapes[2] = new Circle1(5);

        for (Shape1 shape : shapes) {
            System.out.printf("The area is %1$.2f %n", shape.getArea());
        }
    }
}
