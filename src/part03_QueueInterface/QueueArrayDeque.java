package part03_QueueInterface;

import java.util.ArrayDeque;

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
