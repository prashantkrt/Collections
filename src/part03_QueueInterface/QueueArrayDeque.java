package part03_QueueInterface;

import java.util.ArrayDeque;
/* Normal Queue Behavior
 * add() -> internally  calls addLast()
 * offer() -> calls offerLast()
 * poll() -> calls pollFirst()
 * remove() -> calls removeFirst()
 * peek() -> calls peekFirst()
 * element() -> getFirst()
 *
 * */

public class QueueArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offerFirst(4);
        queue.offerLast(5);

        // deletion
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeLast());

        System.out.println(queue.removeFirst());
        System.out.println(queue.peekLast());
        System.out.println(queue.peekFirst());


        System.out.println(queue);




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
