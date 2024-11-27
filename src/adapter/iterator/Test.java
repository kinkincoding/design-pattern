package adapter.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        Enumeration<Integer> enumeration = Collections.enumeration(arrayList);
        Iterator iterator = new EnumerationIterator(enumeration);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
