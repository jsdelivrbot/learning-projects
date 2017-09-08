package solutions;

public class Text implements Drawable {
    private String value;

    public Text() {
        this("");
    }

    public Text(String v) {
        value = v;
    }

    public void draw() {
        System.out.println(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String v) {
        value = v;
    }
}
