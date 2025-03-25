package opgave01;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave01 {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>(List.of(34, 12, 23, 45, 67, 34, 98 ));

        // a) Udskriv alle tallene i dette set
        System.out.println("Initial set: " + mySet);

        // b) Tilføj 23 til dette set
        mySet.add(23);

        // c) Udskriv alle tallene igen
        System.out.println("After adding 23: " + mySet);

        // d) Fjern 67 fra dette set og udskriv
        mySet.remove(67);
        System.out.println("After removing 67: " + mySet);

        // e) Controller hvorvidt dette set indeholder 23
        boolean contains23 = mySet.contains(23);
        System.out.println("Contains 23: " + contains23);

        // f) Udskriv antallet af elementer i dette set
        int size = mySet.size();
        System.out.println("Number of elements: " + size);
    }
}
