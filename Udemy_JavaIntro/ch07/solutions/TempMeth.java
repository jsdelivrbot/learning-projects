package solutions;

public class TempMeth {
    public static void main(String[] args) {
        float f = 80.0F;
        float c = fahrToCelsius(f);
        System.out.println(f + " degrees Fahrenheit is " + c
                + " degrees Celsius.");

        c = 20.0F;
        f = celsiusToFahr(c);
        System.out.println(c + " degrees Celsius is " + f
                + " degrees Fahrenheit.");

        c = 0.0F;
        f = celsiusToFahr(c);
        System.out.println(c + " degrees Celsius is " + f
                + " degrees Fahrenheit.");

        f = 0.0F;
        c = fahrToCelsius(f);
        System.out.println(f + " degrees Fahrenheit is " + c
                + " degrees Celsius.");
    }

    static float fahrToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5.0F / 9.0F;
    }

    static float celsiusToFahr(float celsius) {
        return (celsius * 9.0F / 5.0F) + 32;
    }
}
