package part03_QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueue {
    public static void main(String[] args) {
        /*
         * add()  true is success else exception,if null NPE / offer() true if success else false, if null NPE
         * remove() exception NoSuchElementException if queue is empty / poll() return null is queue is empty
         * element() exception NoSuchElementException if queue is empty / peek() returns null if queue is empty
         *
         * */

        // will behave min/max heap not as FIFO
        Queue<Integer> q = new PriorityQueue<>((a,b)->b-a);

        q.add(3);
        q.add(2);
        q.add(1);
        q.add(4);

        System.out.println(q.peek());
        System.out.println(q.poll());


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
