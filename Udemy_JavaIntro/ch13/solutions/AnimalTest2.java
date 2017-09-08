package solutions;

import solutions.animal.*;
import static java.lang.System.out;

public class AnimalTest2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        // Jackal j = new Jackal(); // This line won't compile

        out.println("The dog says " + d);
        out.println("The cat says " + c);
        // out.println("The jackal says " + j);
    }
}
