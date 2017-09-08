package solutions;

public class Bicycle1 extends Vehicle1 {
    private int numGears;

    public Bicycle1() {
        this(40, 1);
    }

    public Bicycle1(int mspeed, int ngears) {
        super(mspeed, 2);
        numGears = ngears;
    }

    public void setNumGears(int ngears) {
        numGears = ngears;
    }

    public int getNumGears() {
        return numGears;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numGears + " gears";
    }
}
