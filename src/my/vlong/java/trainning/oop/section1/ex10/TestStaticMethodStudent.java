package my.vlong.java.trainning.oop.section1.ex10;

public class TestStaticMethodStudent {
    public static void main(String[] args) {
        Student.change();//calling change method
        //creating objects
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan");
        Student s3 = new Student(333, "Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
