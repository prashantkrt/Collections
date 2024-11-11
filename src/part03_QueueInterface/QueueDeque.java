package part03_QueueInterface;

public class QueueDeque {
    public static void main(String[] args) {


        /*
         *  ArrayDeque and LinkedList
         *  methods :
         *  addFirst() throw exception if insertion operation fails / offerFirst() true/false
         *  addLast() throw exception if insertion operation fails / offerLast() true/false
         *  removeFirst() throw Exception if empty / pollFirst() return null if empty
         *  removeLast() / pollLast()
         *  getFirst() throw exception if queue is empty / peekFirst() return null if empty
         *  getLast() / peekLast()
         *
         *
         * */

        /* Normal Queue Behavior
         * add() -> internally  calls addLast()
         * offer() -> calls offerLast()
         * poll() -> calls pollFirst()
         * remove() -> calls removeFirst()
         * peek() -> calls peekFirst()
         * element() -> getFirst()
         *
         * */


        /*
         * add()  true is success else exception,if null NPE / offer() true if success else false, if null NPE
         * remove() exception NoSuchElementException if queue is empty / poll() return null is queue is empty
         * element() exception NoSuchElementException if queue is empty / peek() returns null if queue is empty
         *
         * */

    }
}
