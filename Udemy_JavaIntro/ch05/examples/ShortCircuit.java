package examples;

public class ShortCircuit {
    public static void main(String[] args) {
        int i = 0;
        int max = 8;

        boolean result = (i >= max) && ((i = max) > 5);
        System.out.println(result + ", with i == " + i);
    }
}
