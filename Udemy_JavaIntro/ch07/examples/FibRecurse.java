package examples;

public class FibRecurse {
    public static void main(String[] args) {

        for (int num = 0; num <= 20; num++) {
            int result = fib(num);
            System.out.println(num + ":\t" + result);
        }
    }

    public static int fib(int ordinal) {
        if (ordinal < 2) {
            return ordinal;
        }
        else {
            return fib(ordinal - 1) + fib(ordinal - 2);
        }
  // alternatively, the above could be written:
  // return (ordinal<2)?ordinal:fib(ordinal - 1) + fib(ordinal - 2);
    }
}
