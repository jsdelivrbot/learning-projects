package examples;

public class FahrToCel2 {
    public static void main(String[] args) {
        int fahr = 0;
        int cel = 0;
        double round = 0.5; // set to 0 to avoid rounding

        System.out.println("Fahrenheit\tCelsius");

        for (fahr = 0; fahr <= 300; fahr += 20) {
            cel = (int) ((5.0 / 9.0) * (fahr - 32.0) + round);
            System.out.println(fahr + "\t\t" + cel);
        }
    }
}
