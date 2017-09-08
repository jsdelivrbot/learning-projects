package solutions;

import solutions.animal.*;
import static java.lang.System.out;

public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        out.println("The dog says " + d);
        out.println("The cat says " + c);
    }
}
