package solutions;

public class VehicleArray {
    public static void main(String[] args) {
        Vehicle1[] myVehicles = new Vehicle1[3];

        myVehicles[0] = new Bicycle1(30, 10);
        myVehicles[1] = new Bicycle1(20, 3);
        myVehicles[2] = new Vehicle1();

        System.out.println("My vehicles: ");

        for (Vehicle1 v : myVehicles) {
            System.out.println(v);
        }
    }
}
