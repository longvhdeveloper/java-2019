package my.vlong.java.trainning.collection.section1.ex1;

import java.util.ArrayList;

//Iterating Collection through the for-each loop
public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        //Traversing list through for-each loop
        for (String obj : al) {
            System.out.println(obj);
        }
    }
}
