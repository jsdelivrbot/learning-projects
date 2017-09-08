package solutions;

public class ObjectArray {
    public static void main(String[] args) {
        Object[] myVehicles = new Object[3];

        myVehicles[0] = new Bicycle1(30, 10);
        myVehicles[1] = new Bicycle1(20, 3);
        myVehicles[2] = new Vehicle1();

        System.out.println("My vehicles: ");

        for (Object o : myVehicles) {
            System.out.println(o);
        }
    }
}
