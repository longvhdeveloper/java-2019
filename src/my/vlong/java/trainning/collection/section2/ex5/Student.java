package my.vlong.java.trainning.collection.section2.ex5;

public class Student implements Comparable<Student> {
    private int rollNo;
    private String name;
    private int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student st) {
        if (age == st.age) {
            return 0;
        } else if (age > st.age) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
