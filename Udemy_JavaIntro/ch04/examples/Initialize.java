package examples;

public class Initialize {

    // These fields are automatically initialized.
    static int fieldI;
    static double fieldD;
    static boolean fieldB;

    public static void main(String[] args) {
        /*
           If you don't initialize these local variables, 
           you can't compile.
         */
        int localI = 17;
        double localD = 1.414213562373095;
        boolean localB = true;

        System.out.println("         Field  Local Variable");
        System.out.println("int:     " + fieldI + "      " + localI);
        System.out.println("double:  " + fieldD + "    " + localD);
        System.out.println("boolean: " + fieldB + "  " + localB);
    }
}
