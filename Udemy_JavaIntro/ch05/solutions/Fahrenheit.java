package solutions;

public class Fahrenheit {

    public static void main(String[] args) {
        int fahr = 212;
        int cel = (int) ((fahr - 32.0) * (5.0 / 9.0));

        System.out.println("Fahrenheit   Celsius");
        System.out.println(fahr + "              " + cel);
    }
}
