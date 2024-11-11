package part03_QueueInterface;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);

        for (int val : pq)
            System.out.println(val);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
