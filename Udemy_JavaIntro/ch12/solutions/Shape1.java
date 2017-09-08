package solutions;

public abstract class Shape1 {
    private Color color;
    private Point point;

    protected Shape1() {
        this(Color.WHITE, 0, 0);
    }

    protected Shape1(Color c, int x, int y) {
        color = c;
        point = new Point(x,y);
    }

    public abstract double getArea();

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
