package my.vlong.java.trainning.oop.section2.ex8;

public class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}
