package solutions;

public class Person2 {
    private String name;
    private int age;

    public Person2(String n, int a) throws InvalidDataException,
            BadAgeException {

        if (n == null || n.equals("")) {
            throw new InvalidDataException();
        }
        name = n;

        if (a < 0 || a > 120) {
            throw new BadAgeException(a);
        }
        age = a;
    }

    public String toString() {
        return "Person2 [name=" + name + ", age=" + age + "]";
    }
}
