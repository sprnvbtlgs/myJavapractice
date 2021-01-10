package myPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Green");
        map.put(10, "Yellow");

        System.out.println(map.get(10));
        System.out.println();

        System.out.println(map.size());
//        map.clear();
//        System.out.println(map.size());

        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Grey"));
        System.out.println();

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }

        System.out.println();
        map.put(3, "Brown");
        System.out.println(map.get(3));

    }
}
