java.lang.Iterable (interface)
│
└── java.util.Collection (interface)
├── java.util.List (interface)
│   ├── java.util.ArrayList
│   │   ├── Resizable array-backed implementation.
│   │   ├── Allows random access; fast read operations.
│   │   └── Not synchronized; better for single-threaded applications.
│   │
│   ├── java.util.LinkedList
│   │   ├── Doubly-linked list implementation.
│   │   ├── Good for frequent inserts/deletes at the beginning or end.
│   │   └── Implements both List and Deque interfaces.
│   │
│   ├── java.util.Vector
│   │   ├── Resizable array implementation, similar to ArrayList.
│   │   ├── Synchronized; thread-safe but generally slower.
│   │   └── Legacy class, generally replaced by ArrayList.
│   │
│   └── java.util.Stack
│       ├── Subclass of Vector.
│       ├── LIFO (Last-In-First-Out) stack.
│       └── Legacy class, generally replaced by Deque implementations like ArrayDeque.
│
├── java.util.Set (interface)
│   ├── java.util.HashSet
│   │   ├── Backed by a HashMap.
│   │   ├── Unordered collection; no duplicate elements.
│   │   └── Allows null elements.
│   │
│   ├── java.util.LinkedHashSet
│   │   ├── Ordered version of HashSet.
│   │   ├── Maintains insertion order.
│   │   └── Slightly slower than HashSet due to ordering.
│   │
│   └── java.util.SortedSet (interface)
│       └── java.util.NavigableSet (interface)
│           └── java.util.TreeSet
│               ├── Sorted set backed by a Red-Black tree.
│               ├── Elements are stored in ascending order.
│               └── Does not allow null elements.
│
├── java.util.Queue (interface)
│   ├── java.util.PriorityQueue
│   │   ├── Elements are ordered based on natural ordering or a custom Comparator.
│   │   ├── Not thread-safe.
│   │   └── Does not allow null elements.
│   │
│   └── java.util.Deque (interface)
│       ├── java.util.ArrayDeque
│       │   ├── Resizable array-based double-ended queue.
│       │   ├── Faster than LinkedList for stack and queue operations.
│       │   └── Does not allow null elements.
│       │
│       └── java.util.LinkedList
│           └── Implements both List and Deque interfaces.
│
└── java.util.Map (interface) [not a subtype of Collection]
├── java.util.HashMap
│   ├── Unordered collection of key-value pairs.
│   ├── Allows one null key and multiple null values.
│   └── Not synchronized; use ConcurrentHashMap in multi-threaded scenarios.
│
├── java.util.LinkedHashMap
│   ├── Ordered version of HashMap.
│   ├── Maintains insertion order.
│   └── Slightly slower than HashMap due to ordering.
│
├── java.util.Hashtable
│   ├── Legacy synchronized map implementation.
│   ├── Does not allow null keys or null values.
│   └── Generally replaced by ConcurrentHashMap in modern code.
│
├── java.util.SortedMap (interface)
│   └── java.util.NavigableMap (interface)
│       └── java.util.TreeMap
│           ├── Sorted map backed by a Red-Black tree.
│           ├── Keys are sorted in ascending order.
│           └── Does not allow null keys but allows null values.
│
└── java.util.concurrent.ConcurrentMap (interface)
└── java.util.concurrent.ConcurrentHashMap
├── Thread-safe implementation of HashMap.
├── Provides better concurrency performance than Hashtable.
└── Does not allow null keys or null values.

└── java.util Other Utility Classes
├── java.util.Collections
│   ├── Utility class for collection-related methods (sorting, unmodifiable views).
│   └── Provides synchronized wrappers for collections.
│
├── java.util.Arrays
│   ├── Utility class for array-related methods (sorting, searching, etc.).
│   └── Provides methods to convert arrays to List.
│
└── java.util.stream.Collectors (Java Streams API)
├── Provides various collector implementations for stream operations.
└── Used in conjunction with Java Streams for reduction operations.
