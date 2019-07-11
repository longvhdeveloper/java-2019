package my.vlong.java.trainning.oop.section1.ex10;

public class Student {
    int rollno;
    String name;
    static String college = "ITS";

    //static method to change the value of static variable
    static void change() {
        college = "BBDIT";
    }

    //constructor to initialize the variable
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
