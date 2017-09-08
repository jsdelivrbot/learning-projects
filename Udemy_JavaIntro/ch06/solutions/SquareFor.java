package solutions;

public class SquareFor {
    public static void main(String[] args) {
        int num;
        int square;

        System.out.println("Number\tSquared");

        for (num = 0; num <= 9; num++) {
            square = num * num;
            System.out.println(num + "\t" + square);
        }
    }
}
