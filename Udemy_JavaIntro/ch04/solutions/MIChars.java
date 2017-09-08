package solutions;

public class MIChars {
    public static void main(String[] args) {
        char first = '\u0044';
        char middle = '\u0053';
        char last = '\u0048';

        // Without the string, java first sums the values of the char
        // variables AS NUMBERS, then prints the result!
        System.out.println(first + middle + last);
    }
}
