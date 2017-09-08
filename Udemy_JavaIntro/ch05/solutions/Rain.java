package solutions;

public class Rain {
    public static void main(String[] args) {
        float mon = 5.5F;
        float tues = 0.0F;
        float wed = 3.2F;
        float thur = 0.5F;
        float fri = 2.75F;
        float sat = 3.0F;
        float sun = 1.25F;

        float totalRain;
        float avgRain;

        System.out.println("Monday:     " + mon + " inches");
        System.out.println("Tuesday:    " + tues + " inches");
        System.out.println("Wednesday:  " + wed + " inches");
        System.out.println("Thursday:   " + thur + " inches");
        System.out.println("Friday:     " + fri + " inches");
        System.out.println("Satday:     " + sat + " inches");
        System.out.println("Sunday:     " + sun + " inches");

        totalRain = mon;
        totalRain += tues;
        totalRain += wed;
        totalRain += thur;
        totalRain += fri;
        totalRain += sat;
        totalRain += sun;

        System.out.println();
        System.out.println("Total Rainfall:    " + totalRain
                + " inches");

        avgRain = totalRain / 7;
        System.out.println();
        System.out.println("Average Rainfall:  " + avgRain + 
                " inches");
    }
}
