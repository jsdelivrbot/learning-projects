package solutions;

public class Circle1 extends Shape1 {
    private int radius;

    public Circle1() {
        this(0);
    }

    public Circle1(int rad) {
        this(Color.WHITE, 0, 0, rad);
    }

    public Circle1(Color c, int xCoord, int yCoord, int rad) {
        super(c, xCoord, yCoord);
        radius = rad;
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
