package my.vlong.java.trainning.collection.section1.ex15;

import java.util.ArrayList;
import java.util.List;

/* Java program to illustrate autoboxing */
public class GFG2 {
    public static void main(String[] args) {
        /* Here we are creating a list
          of elements of Integer type.
          adding the int primitives type values */
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            list.add(i);
    }
}
