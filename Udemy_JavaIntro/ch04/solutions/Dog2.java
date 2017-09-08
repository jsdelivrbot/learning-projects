package solutions;

public class Dog2 {
    public static void main(String[] args) {
        String name;
        float weight;
        int tailLength;
        boolean friendly;

        name = "Fido";
        weight = 34.5F;
        tailLength = 9;
        friendly = true;

        System.out.print(name + " weighs " + weight + " pounds, ");
        System.out.print("has a " + tailLength + " inch tail and ");
        System.out.print("it is " + friendly + " that ");
        System.out.println(name + " is friendly: " + friendly);
    }
}
