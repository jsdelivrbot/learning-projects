package solutions;

public class TempMeth2 {
    public static void main(String[] args) {
        float f = 80.0F;
        float c = fahrToCelsius(f);
        System.out.println(format(f, c));

        c = 20.0F;
        f = celsiusToFahr(c);
        System.out.println(format(f, c));

        c = 0.0F;
        f = celsiusToFahr(c);
        System.out.println(format(f, c));

        f = 0.0F;
        c = fahrToCelsius(f);
        System.out.println(format(f, c));
    }

    static float fahrToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5.0F / 9.0F;
    }

    static float celsiusToFahr(float celsius) {
        return (celsius * 9.0F / 5.0F) + 32;
    }

    static String format(float fahrenheit, float celsius) {
        return celsius + " degrees Celsius is " + fahrenheit
                + " degrees Fahrenheit.";
    }
}
