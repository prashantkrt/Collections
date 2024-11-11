package part03_QueueInterface;

import java.util.PriorityQueue;
/* Normal Queue Behavior
 * add() -> internally  calls addLast()
 * offer() -> calls offerLast()
 * poll() -> calls pollFirst()
 * remove() -> calls removeFirst()
 * peek() -> calls peekFirst()
 * element() -> getFirst()
 *
 * */

public class MinPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(4);

        pq.forEach(System.out::println);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
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
│   ├── HashTable
│   └── SortedMap (interface)
│       └── TreeMap

*/
