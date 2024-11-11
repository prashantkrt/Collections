package part05_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        /*
         * LinkedList implements both Deque and List Interfaces
         * Means it supports Deque methods like getFirst(), getLast(), removeFirst etc..
         * It also supports index operations like get(index),add(index) etc.
         *
         * */

        //only list methods
        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.addAll(Arrays.asList(1, 2, 3, 4));

        //list + Deque methods
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addFirst(100);

        System.out.println(list.getFirst());

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addFirst(200);
        list2.addFirst(300);
        list2.addFirst(400);
        list2.addFirst(100);

        list.addAll(1, list2);
    }
}
