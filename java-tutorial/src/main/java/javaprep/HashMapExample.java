package javaprep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(12, "Chaitanya");
        hm.put(2, "Rahul");
        hm.put(7, "Singh");
        hm.put(49, "Ajeet");
        hm.put(3, "Anuj");

        // Display content of hashmap using iterator

        Set set = hm.entrySet();

        Iterator it = set.iterator();

        while (it.hasNext()) {

          Map.Entry me = (Map.Entry) it.next();

          Object key = me.getKey();
          Object value =  me.getValue();

          System.out.println(key);
          System.out.println(value);

        }
    }
}
