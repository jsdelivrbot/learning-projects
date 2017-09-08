package solutions;

public class Vehicle {
    private int maxSpeed;
    private int numWheels;

    public Vehicle() {
        this(60, 4);
    }

    public Vehicle(int mspeed, int nwheels) {
        maxSpeed = mspeed;
        numWheels = nwheels;
    }

    public void setMaxSpeed(int mspeed) {
        maxSpeed = mspeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setNumWheels(int nwheels) {
        numWheels = nwheels;
    }

    public int getNumWheels() {
        return numWheels;
    }
}
