package examples;

public class PrePost {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        a = ++b;
        System.out.println("Prefix:  a is " + a + ", b is " + b);

        // Reinitialize the variables:
        a = 0;
        b = 0;

        a = b++;
        System.out.println("Postfix: a is " + a + ", b is " + b);
    }
}
