package examples;

public class Kids2 {
    public static void main(String[] args) {
        int age = 2;
        // int age = 9;
        // int age = 14;
        // int age = 23;
        System.out.println("If your age is " + age + " then you:");

        if (age < 12 && age > 3) {
            System.out.println("Order kid's meals.");
            System.out.println("Buy child movie ticket.");
        }
        else if (age >= 12 && age < 16) {
            System.out.println("Cannot drive.");
        }
        else if (age >= 16) {
            System.out.println("Can drive and have a job.");
            System.out.println("Pay full price for meals.");
            System.out.println("Buy adult movie ticket.");
        }
        else
            // babies and toddlers
            System.out.println("Get into movies free.");
    }
}
