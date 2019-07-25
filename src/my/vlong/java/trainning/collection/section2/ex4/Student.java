package my.vlong.java.trainning.collection.section2.ex4;

public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public int compareTo(Student person) {
        return name.compareTo(person.getName());

    }

    public String getName() {
        return name;
    }
}
