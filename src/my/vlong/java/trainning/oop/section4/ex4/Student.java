package my.vlong.java.trainning.oop.section4.ex4;

public class Student {
    private String name;
    private int id;
    private String dept;

    Student(String name, int id, String dept) {

        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }
}
