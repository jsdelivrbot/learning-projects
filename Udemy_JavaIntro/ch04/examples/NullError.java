package examples;

public class NullError {
    public static void main(String args[]) {
        String s;                          // uninitialized
        // System.out.println(s.length()); // Compiler Error
        s = null;                          // s refers to null
        System.out.println(s.length());    // Runtime Error
    }
}
