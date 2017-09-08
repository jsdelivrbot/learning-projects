package examples;

public class MethCall {
    public static void main(String[] args) {
        System.out.println("Pick a number from one to ten.");
        int num = (int) (Math.random() * 10.0) + 1;
        System.out.println("Is it " + num + "?");
    }
}
