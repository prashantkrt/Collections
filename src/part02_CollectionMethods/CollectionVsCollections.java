package part02_CollectionMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionVsCollections {

    public static void main(String[] args) {
        /*
        * Collection: It represents the group of objects. It is part of the Collection framework
        * And its interface, which exposes various methods which are implemented by various Collection
        * classes Like: ArrayList, Stack, LinkedList, etc.
        *
        * Collections: It is a Utility class and provides static methods, which are used to operate
        * on Collections like sorting, swapping, searching reverse, copy, etc.
        * */

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);

        System.out.println(Collections.max(values));
        System.out.println(Collections.min(values));

        Collections.sort(values,Collections.reverseOrder());
        values.sort(Collections.reverseOrder());
        System.out.println(values);

    }
}
