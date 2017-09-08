package solutions;

public class Circle3 extends Shape3 {
    private int radius;

    public Circle3() {
        this(0);
    }

    public Circle3(int rad) {
        this(Color.WHITE, 0, 0, rad);
    }

    public Circle3(Color c, int xCoord, int yCoord, int rad) {
        super(c, xCoord, yCoord);
        radius = rad;
    }

    public void draw() {
        System.out.printf("Circle at %1$d, %2$d in color %3$s %n",
                getXCoordinate(), getYCoordinate(), getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }
}
