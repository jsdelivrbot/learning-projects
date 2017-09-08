package solutions;

public class Employee7 {
    public static int retirementAge = 72;
    public static float minimumWage = 6.75F;
    private String firstName;
    private String lastName;
    private float salary;
    private int id;

    // constructors
    public Employee7(String fname, String lname) {
        firstName = fname;
        lastName = lname;
    }

    public Employee7() {
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
        return "Employee7 [firstName=" + firstName + ", lastName="
                + lastName + ", salary=" + salary + ", id=" + id + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + id;
        result = prime * result
                + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + Float.floatToIntBits(salary);
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee7 other = (Employee7) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        }
        else if (!firstName.equals(other.firstName))
            return false;
        if (id != other.id)
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        }
        else if (!lastName.equals(other.lastName))
            return false;
        if (Float.floatToIntBits(salary) != Float
                .floatToIntBits(other.salary))
            return false;
        return true;
    }
}