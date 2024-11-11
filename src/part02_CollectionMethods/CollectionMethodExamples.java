package part02_CollectionMethods;

import java.util.*;

public class CollectionMethodExamples {
    public static void main(String[] args) {
       /* 1. size()
        Description: Returns the number of elements in the collection.
        Return Type: int
        */

        Collection<String> items1 = new ArrayList<>();
        items1.add("Apple");
        items1.add("Banana");
        System.out.println(items1.size());  // Output: 2


        /*2. isEmpty()
        Description: Checks if the collection is empty.
        Return Type: boolean
        */

        Collection<String> items2 = new ArrayList<>();
        System.out.println(items2.isEmpty());  // Output: true
        items2.add("Apple");
        System.out.println(items2.isEmpty());  // Output: false



        /*3. contains(Object o)
        Description: Checks if the collection contains the specified element.
        Return Type: boolean
        */
        Collection<String> items3 = new ArrayList<>();
        items3.add("Apple");
        System.out.println(items3.contains("Apple"));  // Output: true


       /*
        4. containsAll(Collection<?> c)
        Description: Checks if the collection contains all elements of the specified collection.
        Return Type: boolean
        */
        Collection<String> items4 = new ArrayList<>();
        items4.add("Apple");
        items4.add("Banana");
        Collection<String> fruits = Arrays.asList("Apple", "Banana");
        System.out.println(items4.containsAll(fruits));  // Output: true


        /*
        5. toArray()
        Description: Converts the collection to an array.
        Return Type: Object[]
        */
        Collection<String> items5 = new ArrayList<>();
        items5.add("Apple");
        items5.add("Banana");
        Object[] array = items5.toArray();
        System.out.println(Arrays.toString(array));  // Output: [Apple, Banana]


       /*
        6. add(E e)
        Description: Adds the specified element to the collection.
        Return Type: boolean (usually returns true)
        */

        Collection<String> items6 = new ArrayList<>();
        items6.add("Apple");  // Adds "Apple" to the collection

       /*
        7. remove(Object o)
        Description: Removes a single instance of the specified element from the collection.
        Return Type: boolean (returns true if the element was removed)
        */

        Collection<String> items7 = new ArrayList<>();
        items7.add("Apple");
        items7.remove("Apple");  // Removes "Apple" from the collection


       /*
        8. addAll(Collection<? extends E> c) like Collection<? extends Animal> animals where Animal is a class
        Description: Adds all elements from the specified collection to this collection.
        Return Type: boolean
       */

        Collection<String> items8 = new ArrayList<>();
        Collection<String> moreItems = Arrays.asList("Apple", "Banana");
        items8.addAll(moreItems);
        System.out.println(items8);  // Output: [Apple, Banana]


        /*
        9. removeAll(Collection<?> c)
        Description: Removes all elements in this collection that are also contained in the specified collection.
        Return Type: boolean
        */

        Collection<String> items9 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        Collection<String> toRemove = Arrays.asList("Apple", "Orange");
        items9.removeAll(toRemove);
        System.out.println(items9);  // Output: [Banana]


        /*
        10. clear()
        Description: Removes all elements from the collection.
        Return Type: void
        */

        Collection<String> items10 = new ArrayList<>(Arrays.asList("Apple", "Banana"));
        items10.clear();
        System.out.println(items10);  // Output: []


        /*
        11. equals(Object o)
        Description: Checks if the specified object is equal to the collection.
        Return Type: boolean
        */

        Collection<String> items111 = new ArrayList<>(Arrays.asList("Apple", "Banana"));
        Collection<String> items112 = new ArrayList<>(Arrays.asList("Apple", "Banana"));
        System.out.println(items111.equals(items112));  // Output: true


        /*
        12. get(int index) (specific to List)
        Description: Retrieves the element at the specified index (only for List).
        Return Type: E
        */
        List<String> items = new ArrayList<>(Arrays.asList("Apple", "Banana"));
        System.out.println(items.get(1));  // Output: Banana


        /*
        13. stream() and parallelStream() (Java 8+)
        Description: Creates a sequential (stream()) or parallel (parallelStream()) stream from the collection.
        Return Type: Stream<E>
        */

        Collection<String> items13 = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        items13.stream().forEach(System.out::println);


        /*
        14. iterator()
        Description: Returns an iterator over the elements in the collection.
        Return Type: Iterator<E>
       */
        Collection<String> items14 = new ArrayList<>(Arrays.asList("Apple", "Banana"));
        Iterator<String> iterator = items14.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }













    }
}
