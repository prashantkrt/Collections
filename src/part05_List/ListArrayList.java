package part05_List;

import java.util.ArrayList;
import java.util.List;
// null element and duplicates are allowed
// insertion order maintained
public class ListArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //add(int index, Element e)
        list.add(0,100);
        list.add(1,200);
        list.add(2,300);
        list.add(3,400);


        //addAll(int index, Collection c)
        List<Integer> list1 = new ArrayList<>();
        list1.add(0,500);
        list1.add(1,600);
        list1.add(2,700);
        list1.add(3,800);

        System.out.println(list1.size());
        list1.set(1,900);
        System.out.println(list1.size());

        list.addAll(0,list1);

        list.forEach(System.out::println);

        list.replaceAll(i->i*2);
        System.out.println();
        list.forEach(System.out::println);

        list.sort((a,b)-> a-b);
        list.forEach(System.out::println);

        list.remove(1);
        list.remove(Integer.valueOf(23));

        List<Integer> list2 = list.subList(0,2); // shallow copy
        list2.forEach(System.out::println);

        System.out.println(list);
        list2.add(20);
        list2.forEach(i-> System.out.print(i+" "));
        System.out.println();
        list.forEach(i->System.out.print(i+" "));

    }
}
