package solutions;

public class Vehicle1 {
    private int maxSpeed;
    private int numWheels;

    public Vehicle1() {
        this(60, 4);
    }

    public Vehicle1(int mspeed, int nwheels) {
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

    @Override
    public String toString() {
        return numWheels + " wheels, " + maxSpeed + " mph max speed";
    }
}
