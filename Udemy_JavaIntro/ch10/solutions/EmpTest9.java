package solutions;

public class EmpTest9 {
    public static void main(String[] args) {
        Employee8 e = new Employee8("Bob", "Dobbs");
        e.setSalary(59900.00F);
        e.setId(42);

        // Test the no-arg constructor
        Employee8 e2 = new Employee8();

        System.out.println(e);
        System.out.println(e2);
    }
}
