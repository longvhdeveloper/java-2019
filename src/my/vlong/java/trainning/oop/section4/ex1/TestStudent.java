package my.vlong.java.trainning.oop.section4.ex1;

public class TestStudent {
    public static void main(String[] args) {
        //creating instance of the encapsulated class
        Student s = new Student();
        //setting value in the name member
        s.setName("vlong");
        //getting value of the name member
        System.out.println(s.getName());
    }
}
