package part02_CollectionMethods;

import java.util.*;

public class CollectionVsCollections {

    public static void main(String[] args) {
        /*
        * Collection: It represents the group of objects. It is part of the Collection framework
        * And its interface, which exposes various methods which are implemented by various Collection
        * classes Like: ArrayList, Stack, LinkedList, etc.
        *
        * Collections: It is a Utility class and provides static methods, which are used to operate
        * on Collections like sorting, swapping, searching reverse, copy, etc.
        * */

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println(Collections.max(values));
        System.out.println(Collections.min(values));

        Collections.sort(values,Collections.reverseOrder());
        values.sort(Collections.reverseOrder());
        System.out.println(values);


        List<Integer> list = Arrays.asList(5, 3, 7, 1, 9);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        List<String> list2 = Arrays.asList("Apple", "Banana", "Cherry");
        Collections.sort(list2, Comparator.reverseOrder());
        System.out.println("Reverse Sorted List: " + list2);

        List<String> list3 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("Before Swap: " + list);
        Collections.swap(list3, 0, 3);  // Swap element at index 0 with element at index 3
        System.out.println("After Swap: " + list3);


        List<String> list4 = Arrays.asList("Apple", "Banana", "Cherry");
        // Linear search
        boolean contains = list4.contains("Banana");
        System.out.println("Contains Banana? " + contains);

        // Binary search (requires sorted list)
        Collections.sort(list4);  // Sort the list
        int index = Collections.binarySearch(list4, "Banana");
        System.out.println("Index of Banana: " + index);

        List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Before Reverse: " + list5);
        Collections.reverse(list5);
        System.out.println("After Reverse: " + list5);



    }
}
