package solutions;

public abstract class Shape3 implements Drawable, Comparable<Shape3> {
    private Color color;
    private Point point;

    protected Shape3() {
        this(Color.WHITE, 0, 0);
    }

    protected Shape3(Color c, int x, int y) {
        color = c;
        point = new Point(x, y);
    }

    public abstract double getArea();

    @Override
    public int compareTo(Shape3 other) {
        if (this.getArea() < other.getArea()) {
            return -1;
        }
        else if (this.getArea() > other.getArea()) {
            return 1;
        }
        return 0;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color c) {
        color = c;
    }

    public int getXCoordinate() {
        return point.getXCoordinate();
    }

    public void setXCoordinate(int x) {
        point.setXCoordinate(x);
    }

    public int getYCoordinate() {
        return point.getYCoordinate();
    }

    public void setYCoordinate(int y) {
        point.setYCoordinate(y);
    }
}
