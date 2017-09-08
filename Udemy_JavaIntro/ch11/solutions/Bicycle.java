package solutions;

public class Bicycle extends Vehicle {
    private int numGears;

    public Bicycle() {
        this(40, 1);
    }

    public Bicycle(int mspeed, int ngears) {
        super(mspeed, 2);
        numGears = ngears;
    }

    public void setNumGears(int ngears) {
        numGears = ngears;
    }

    public int getNumGears() {
        return numGears;
    }
}
