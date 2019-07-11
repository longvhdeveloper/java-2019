package my.vlong.java.trainning.oop.section1.ex7;

public class Student {
    int id;
    String name;
    //creating a parameterized constructor
    public Student(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){System.out.println(id+" "+name);}

    public static void main(String args[]){
        //creating objects and passing values
        Student s1 = new Student(111,"Karan");
        Student s2 = new Student(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}
