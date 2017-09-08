package solutions;

public class BadAgeException extends Exception {
    private int badAge;

    public BadAgeException(int a) {
        badAge = a;
    }

    public String getMessage() {
        return "Age must be between 0 and 120.";
    }

    public int getBadAge() {
        return badAge;
    }
}
