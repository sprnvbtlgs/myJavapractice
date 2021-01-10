package myPackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        //set - unique objects, not duplicate value
        //You can't use set.get()
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);

        System.out.println(set.size());
        System.out.println();

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        for (int i : set) {
            System.out.println(i);
        }
        System.out.println();

        set.remove(11);
        for (int i : set) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println(set.contains(11));
        System.out.println(set.contains(10));
    }
}
