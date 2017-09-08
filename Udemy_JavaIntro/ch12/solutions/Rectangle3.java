package solutions;

public class Rectangle3 extends Shape3 {
    private int width;
    private int height;

    public Rectangle3() {
        this(0, 0);
    }

    public Rectangle3(int w, int h) {
        this(Color.WHITE, 0, 0, w, h);
    }

    public Rectangle3(Color c, int xCoord, int yCoord, int w, int h) {
        super(c, xCoord, yCoord);
        width = w;
        height = h;
    }

    public void draw() {
        System.out.printf("Rectangle at %1$d, %2$d in color %3$s %n",
                getXCoordinate(), getYCoordinate(), getColor());
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public int getWidthd() {
        return width;
    }

    public void setWidth(int w) {
        width = w;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        height = h;
    }
}
