package solutions;

public class Overflow {
    public static void main(String[] args) {
        int big = 2147483647;
        int bigger = big + 1;

        System.out.println("Big:    " + big);
        System.out.println("Bigger: " + bigger);
    }
}
