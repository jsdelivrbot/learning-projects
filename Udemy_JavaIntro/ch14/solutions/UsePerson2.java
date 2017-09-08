package solutions;

public class UsePerson2 {
    public static void main(String[] args) {
        Person2 p = null;
        String name = null;
        name = "Some Name"; // comment this line to see an exception
        int age = 134;
        age = 10; // comment this line to see an exception;

        try {
            // change age to 134 to see exception:
            p = new Person2(name, age);
        }
        catch (InvalidDataException | BadAgeException e) {
            System.err.println(e.getMessage());
        }

        System.out.println(p);
    }
}
