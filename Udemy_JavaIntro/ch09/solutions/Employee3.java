package solutions;

public class Employee3 {
    public static int retirementAge = 72;
    public static float minimumWage = 6.75F;
    public String firstName;
    public String lastName;
    public float salary;
    public int id;

    public void showEmp() {
        System.out.println("Employee " + "(Min Wage: " + minimumWage
                + ", Ret Age: " + retirementAge + "):");
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
    }
}
