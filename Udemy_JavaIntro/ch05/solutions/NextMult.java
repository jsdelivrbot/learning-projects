package solutions;

public class NextMult {
    public static void main(String[] args) {
        int i = 256;
        int j = 7;
        int nextLargestMultiple = i + j - i % j;

        System.out.print("The next largest multiple of " + j);
        System.out
                .println(" after " + i + " is " + nextLargestMultiple);
    }
}
