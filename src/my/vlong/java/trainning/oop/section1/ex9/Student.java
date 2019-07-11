package my.vlong.java.trainning.oop.section1.ex9;

public class Student {
    int rollno;//instance variable
    String name;
    static String college = "ITS";//static variable

    //constructor
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
