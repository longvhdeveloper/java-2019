package my.vlong.java.trainning.collection.section2.ex3;

import java.util.Hashtable;

public class HashTable2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<Integer, String>();
        map.put(100, "Amit");
        map.put(102, "Ravi");
        map.put(101, "Vijay");
        map.put(103, "Rahul");
        System.out.println("Before remove: " + map);
        // Remove value for key 102
        map.remove(102);
        System.out.println("After remove: " + map);
    }
}
