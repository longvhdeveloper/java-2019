package my.vlong.java.trainning.oop.section4.ex4;

import java.util.List;

/* Department class contains list of student
Objects. It is associated with student
class through its Object(s). */
public class Department {
    private String name;
    private List<Student> students;

    Department(String name, List<Student> students) {

        this.name = name;
        this.students = students;

    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
