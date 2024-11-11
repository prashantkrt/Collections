package part02_CollectionMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {

        /*
         * 1. size()
         * 2. isEmpty()
         * 3. contains()/ containsAll
         * 4. toArray()
         * 5. add()
         * 6. remove(index)
         * 7. addAll()
         * 8. removeAll
         * 9. clear()
         * 10. equals()
         * 11. get(index)
         * 12. stream() or parallelStream() 1.8
         * 13. iterator()
         * */

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        //size
        System.out.println(values.size());

        //isEmpty()
        System.out.println(values.isEmpty());

        //contains
        System.out.println(values.contains(5));

        //add
        values.add(20);

        values.remove(2);

        values.remove(Integer.valueOf(20));

        System.out.println(values);

        values.addAll(List.of(10, 11, 12, 13, 14, 15, 16, 17, 18, 19));

        values.removeAll(Arrays.asList(1, 2, 3, 4));

        System.out.println(values.get(1));

        Iterator<Integer> iterator = values.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Object[] a = values.toArray();
        Integer [] aa = (Integer []) a;

        values.clear();


    }
}
