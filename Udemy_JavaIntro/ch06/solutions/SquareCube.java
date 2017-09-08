package solutions;

public class SquareCube {
    public static void main(String[] args) {
        int num;
        int square;
        int cube;

        System.out.println("Number\tSquared\tCubed");

        num = 0;
        while (num <= 9) {
            square = num * num;
            cube = num * num * num;

            if ((num % 2) == 0) {
                System.out.println(num + "\t" + square + "\t" + cube);
            }
            else {
                System.out.println(num + "\t" + square);
            }
            num++;
        }
    }
}
