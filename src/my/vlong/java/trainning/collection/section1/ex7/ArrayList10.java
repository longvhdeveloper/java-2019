package my.vlong.java.trainning.collection.section1.ex7;

import java.util.ArrayList;

// Java ArrayList example of isEmpty() method
public class ArrayList10 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After Insertion");
        System.out.println("Is ArrayList Empty: " + al.isEmpty());
    }
}
