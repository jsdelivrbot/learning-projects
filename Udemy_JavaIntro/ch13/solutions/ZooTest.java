package solutions;

import solutions.animal.*;
import solutions.zoo.*;
import static java.lang.System.out;

public class ZooTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        solutions.animal.Cat c = new solutions.animal.Cat();
        solutions.zoo.Cat z = new solutions.zoo.Cat();

        out.println("The dog says " + d);
        out.println("The cat says " + c);
        out.println("The big cat says " + z);
    }
}
