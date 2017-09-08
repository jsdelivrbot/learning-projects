package solutions;

public class EmpTest10 {
    public static void main(String[] args) {
        Employee9 e = new Employee9("Bob", "Dobbs", Title.MANAGER);
        e.setSalary(59900.00F);
        e.setId(42);

        // Test the no-arg constructor
        Employee9 e2 = new Employee9();

        System.out.println(e);
        System.out.println(e2);
    }
}
