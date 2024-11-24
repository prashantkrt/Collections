package part07_SetInterfcae;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // Add elements
        set.add("A");
        set.add("B");
        set.add("C");

        // Check size
        System.out.println("Set size: " + set.size());

        // Check if set contains an element
        System.out.println("Contains 'A': " + set.contains("A"));

        // Remove an element
        set.remove("B");

        // Iterate over elements
        for (String element : set) {
            System.out.println("Element: " + element);
        }

        // Clear the set
        set.clear();
        System.out.println("Is set empty? " + set.isEmpty());
    }
}
