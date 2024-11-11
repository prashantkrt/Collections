package part06_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.put(1,map.getOrDefault(1,0)+1);
        System.out.println(map);

        HashMap<Character,Integer> map2 = new HashMap<>();
        char [] arr= {'a','b','c','d','e','f','a','a','c','d'};

        for(char ch:arr){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        //else
        for(char ch:arr){
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }
            else
                map2.put(ch,1);
        }

        map2.remove('a');

        System.out.println(map2.isEmpty());

        for(Map.Entry<Character,Integer> entry:map2.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        System.out.println(map2);

    }
}
