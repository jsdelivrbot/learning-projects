package solutions;

public class BicycleArray {
    public static void main(String[] args) {
        Bicycle1[] myVehicles = new Bicycle1[3];

        myVehicles[0] = new Bicycle1(30, 10);
        myVehicles[1] = new Bicycle1(20, 3);
        //myVehicles[2] = new Vehicle1(); // This line won't compile!

        System.out.println("My vehicles: ");

        for (Bicycle1 b : myVehicles) {
            System.out.println(b);
        }
    }
}
