package examples;

public class Sphere {
    public static void main(String[] args) {
        float PI = 3.14F;
        int radius = 6;

        float circumference = radius * 2 * PI;
        float volume = 4.0F / 3.0F * PI * radius * radius * radius;

        System.out.print("A sphere of radius ");
        System.out.print(radius);
        System.out.print(" has a circumference of ");
        System.out.print(circumference);
        System.out.print(" and a volume of ");
        System.out.print(volume);
        System.out.println(".");
    }
}
