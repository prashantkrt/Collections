package part03_QueueInterface;

import java.util.PriorityQueue;

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
