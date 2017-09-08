package solutions;

public class EmpTest7 {
    public static void main(String[] args) {
        Employee7 e = new Employee7("Bob", "Dobbs");
        e.setSalary(59900.00F);
        e.setId(42);

        // Test the no-arg constructor
        Employee7 e2 = new Employee7();

        System.out.println(e);
        System.out.println(e2);

        if (e.equals(e2)) {
            System.out.println("Objects are equal");
        }
        else {
            System.out.println("Objects are not equal");
        }
    }
}