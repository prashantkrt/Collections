package part01_Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// java 1.5 Iterable interface
public class IteratorDemo {
    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
            if (value == 3)
                iterator.remove();
        }
        System.out.println(values);

        // java 1.8
        for(Integer value : values) {
            System.out.println(value);
        }

        values.forEach(System.out::println);
    }
}
/*

Java Collections Framework

├── Iterable (interface)
│   ├── Collection (interface)
│   │   ├── List (interface)
│   │   │   ├── ArrayList
│   │   │   ├── LinkedList
│   │   │   ├── Vector
│   │   │       └── Stack
│   │   ├── Set (interface)
│   │   │   ├── HashSet
│   │   │   ├── LinkedHashSet
│   │   │   └── SortedSet (interface)
│   │   │       └── TreeSet
│   │   └── Queue (interface)
│   │       ├── PriorityQueue
│   │       ├── LinkedList (also implements Queue)
│   │       └── Deque (interface)
│   │           ├── ArrayDeque
│   │           └── LinkedList (also implements Deque)
├── Map (interface)
│   ├── HashMap
│   ├── LinkedHashMap
│   └── SortedMap (interface)
│       └── TreeMap

*/
