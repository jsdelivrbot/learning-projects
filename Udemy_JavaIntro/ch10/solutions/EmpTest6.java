package solutions;

public class EmpTest6 {
    public static void main(String[] args) {
        Employee6 e = new Employee6("Bob", "Dobbs");
        e.setSalary(59900.00F);
        e.setId(42);

        // Test the no-arg constructor
        Employee6 e2 = new Employee6();

        System.out.println(e);
        System.out.println(e2);
    }
}
