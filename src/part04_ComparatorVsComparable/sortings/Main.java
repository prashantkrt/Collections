package part04_ComparatorVsComparable.sortings;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Integer [] arr = {15,12,11,4,2,10};

        //reverse Order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));

        //or
        Arrays.sort(arr, (a,b)->b-a);
        System.out.println(Arrays.toString(arr));

        //or
        Arrays.sort(arr, (a,b)->Integer.compare(b,a));
    }
}
