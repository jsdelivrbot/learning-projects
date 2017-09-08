package examples;

public class SphereObj {
    int radius; // instance field
    static float PI = (float) Math.PI; // static field

    public static void main(String[] args) {
        SphereObj s = new SphereObj();
        s.radius = 6;

        float circum = s.getCircum();
        float volume = s.getVolume();

        System.out.print("A sphere of radius ");
        System.out.print(s.radius);
        System.out.print(" has a circumference of ");
        System.out.print(circum);
        System.out.print(" and a volume of ");
        System.out.print(volume);
        System.out.println(".");
    }

    float getCircum() {
        return radius * 2 * PI;
    }

    float getVolume() {
        return (4.0F / 3.0F) * PI * (float) Math.pow(radius, 3.0);
    }
}
