package myPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        //int[] array = new int[3];
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(8);

        int a = list.get(2);

        System.out.println(list.get(1));
        System.out.println(a);
        System.out.println();

        list.set(2, 100);
        System.out.println(list.get(2));
        System.out.println();

        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println();

        System.out.println(list.size());
        list.add(88);
        System.out.println(list.size());
        System.out.println();

//        list.clear();
//        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(88);
        list2.add(99);
        list.addAll(list2);
        System.out.println(list.size());

        list.removeAll(list2);
        System.out.println(list.size());

        System.out.println();
        System.out.println(list.isEmpty());

        System.out.println();
        System.out.println(list.contains(5));

        System.out.println();
        list.addAll(list2);
        System.out.println(list.containsAll(list2));

        Iterator<Integer> iterator = list.iterator();
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
