package solutions;

public class SquareWhile {
    public static void main(String[] args) {
        int num;
        int square;

        System.out.println("Number\tSquared");

        num = 0;
        while (num <= 9) {
            square = num * num;
            System.out.println(num + "\t" + square);
            num++;
        }
    }
}
