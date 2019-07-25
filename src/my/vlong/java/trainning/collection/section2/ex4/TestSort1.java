package my.vlong.java.trainning.collection.section2.ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Example to sort string objects
public class TestSort1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Viru");
        al.add("Saurav");
        al.add("Mukesh");
        al.add("Tahir");

        Collections.sort(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
