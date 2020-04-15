package javaprep;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by pmukkamala on 5/29/18.
 */
public class HashTableExample {

    public static void main(String[] args) {

        Enumeration names;
        String key;

        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        hashtable.put("Name1","Chaitanya");
        hashtable.put("Name2","Ajeet");
        hashtable.put("Name3","Peter");
        hashtable.put("Name4","Ricky");
        hashtable.put("Name5","Mona");

        names = hashtable.keys();

        while (names.hasMoreElements()) {

            key = (String) names.nextElement();
            System.out.println("Key: " + key + " & " + "Value: " + hashtable.get(key));
        }
    }

}
