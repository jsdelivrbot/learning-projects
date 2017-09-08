package examples;

public class Work2 {
    public static void main(String[] args) {
        int day;
        for (day = 1; day <= 7; day++) {
            if (day == 6 || day == 7) {
                System.out.println("It's a weekend!");
            }
            else {
                System.out.println("Get up early.");
                System.out.println("Go to work.");
                System.out.println("Sit in meetings.");
            }
        }
    }
}
