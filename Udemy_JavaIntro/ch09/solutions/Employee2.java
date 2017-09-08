package solutions;

public class Employee2 {
    public String firstName;
    public String lastName;
    public float salary;
    public int id;

    public void showEmp() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: " + salary);
    }
}
