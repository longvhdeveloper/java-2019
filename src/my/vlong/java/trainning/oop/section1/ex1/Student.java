package my.vlong.java.trainning.oop.section1.ex1;

//Java Program to illustrate how to define a class and fields
//Defining a Student class.
public class Student {
    //defining fields
    int id;//field or data member or instance variable
    String name;

    //creating main method inside the Student class
    public static void main(String[] args) {
        //Creating an object or instance
        Student s1 = new Student();//creating an object of Student
        //Printing values of the object
        System.out.println(s1.id);//accessing member through reference variable
        System.out.println(s1.name);
    }
}
