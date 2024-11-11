package part05_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        ListIterator<Integer> listItr = list.listIterator(list.size());

        //traversing backward
        while (listItr.hasPrevious()) {
            int previousVal = listItr.previous();
            System.out.println("traversing backward : " + previousVal + " nextIndex : " + listItr.nextIndex() + " previousIndex : " + listItr.previousIndex());
            if (previousVal == 2)
                listItr.set(30);
            if(previousVal==3)
                listItr.add(20);
        }

        System.out.println(list);

        //traversing forward
        ListIterator<Integer> listItr2 = list.listIterator();
        while (listItr2.hasNext()) {
            int val = listItr2.next();
            System.out.println("traversing forward: "+ val + " nextIndex : " + listItr2.nextIndex() + " previousIndex : " + listItr2.previousIndex());
            if(val==30)
                listItr2.set(40);
            if(val==40)
                listItr2.add(20);
        }

    }

}
