package javaprep;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class TreeMapExample {

    public static void main (String[] args) {

        TreeMap <Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(10, "Chaitanya");
        tm.put(1, "Ajeet");
        tm.put(11, "Test");
        tm.put(9, "Demo");
        tm.put(3, "Anuj");

        Set set = tm.entrySet();

        //Get an iterator

        Iterator it = set.iterator();

        while (it.hasNext()) {

            Map.Entry map = (Map.Entry) it.next();
            System.out.println("Key: " + map.getKey());
            System.out.println("Value: " + map.getValue());
        }
    }
}
