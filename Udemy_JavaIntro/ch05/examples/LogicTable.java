package examples;

public class LogicTable {
    public static void main(String[] args) {
        System.out.println("\n      Logical AND");
        System.out.println("------------------------");
        System.out.println("false && false = " + (false && false));
        System.out.println(" true && true  = " + (true && true));
        System.out.println("false && true  = " + (false && true));
        System.out.println(" true && false = " + (true && false));
        System.out.println("\n      Logical OR");
        System.out.println("------------------------");
        System.out.println("false || false = " + (false || false));
        System.out.println(" true || true  = " + (true || true));
        System.out.println("false || true  = " + (false || true));
        System.out.println(" true || false = " + (true || false));
        System.out.println("\n      Logical NOT");
        System.out.println("------------------------");
        System.out.println("! false = " + (!false));
        System.out.println("! true  = " + (!true));
    }
}
