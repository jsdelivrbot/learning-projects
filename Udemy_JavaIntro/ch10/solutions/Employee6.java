package solutions;

public class Employee6 {
    public static int retirementAge = 72;
    public static float minimumWage = 6.75F;
    private String firstName;
    private String lastName;
    private float salary;
    private int id;

    // constructors
    public Employee6(String fname, String lname) {
        firstName = fname;
        lastName = lname;
    }

    public Employee6() {
        this("J.", "Doe");
    }

    public void showEmp() {
        System.out.println("Employee " + "(Min Wage: " + minimumWage
                + ", Ret Age: " + retirementAge + "):");
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
    }

    // gets and sets
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float s) {
        salary = s;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String toString() {
        return "Employee6 [firstName=" + firstName + ", lastName="
                + lastName + ", salary=" + salary + ", id=" + id + "]";
    }
}