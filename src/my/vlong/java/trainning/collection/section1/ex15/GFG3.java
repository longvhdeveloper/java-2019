package my.vlong.java.trainning.collection.section1.ex15;

import java.util.ArrayList;
import java.util.List;

/* Java program to illustrate autoboxing */
public class GFG3 {
    public static void main(String[] args) {
        /* Here we are creating a list of elements
          of Integer type. Adding the int primitives
          type values by converting them into Integer
          wrapper Object*/
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
            list.add(Integer.valueOf(i));

    }
}
