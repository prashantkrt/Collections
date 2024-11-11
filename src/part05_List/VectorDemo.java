package part05_List;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        /*
        * Exactly the same as ArrayList
        * but it's a thread safes
        *
        * */

        Vector<String> v = new Vector<>();
        v.add("A");
        v.add("B");
        System.out.println(v.get(0));
    }
}
