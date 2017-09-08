package examples;

public class Concat {
    public static void main(String[] args) {
        if (args.length > 1) {
            String s = new String("<" + args[0] + args[1] + ">");
            System.out.println(s);
        }
    }
}
