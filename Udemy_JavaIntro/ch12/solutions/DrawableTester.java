package solutions;

public class DrawableTester {
    public static void main(String[] args) {
        Drawable[] drawables = new Drawable[3];

        drawables[0] = new Rectangle2(Color.BLUE, 50, 40, 3, 60);
        drawables[1] = new Rectangle2(6, 4);
        drawables[2] = new Circle2(Color.GREEN, 100, 20, 5);

        for (Drawable d : drawables) {
            d.draw();
        }
    }
}
