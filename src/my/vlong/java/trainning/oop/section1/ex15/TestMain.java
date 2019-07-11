package my.vlong.java.trainning.oop.section1.ex15;

public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student(111, "ankit", "java");
        Student s2 = new Student(112, "sumit", "java", 6000f);
        s1.display();
        s2.display();
    }
}
