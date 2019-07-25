package my.vlong.java.trainning.collection.section2.ex4;

import java.util.ArrayList;
import java.util.Collections;

public class TestSort4 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("Viru"));
        al.add(new Student("Saurav"));
        al.add(new Student("Mukesh"));
        al.add(new Student("Tahir"));

        Collections.sort(al);
        for (Student s : al) {
            System.out.println(s.getName());
        }
    }
}
