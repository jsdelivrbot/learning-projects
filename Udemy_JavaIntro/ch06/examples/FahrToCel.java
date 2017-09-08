package examples;

public class FahrToCel {
    public static void main(String[] args) {
        int fahr = 0;
        int cel = 0;
        double round = 0.5; // set to 0 to avoid rounding

        System.out.println("Fahrenheit\tCelsius");

        while (fahr <= 300) {
            cel = (int) ((5.0 / 9.0) * (fahr - 32.0) + round);
            System.out.println(fahr + "\t\t" + cel);
            fahr += 20;
        }
    }
}
