package my.vlong.java.trainning.oop.section1.ex13;

public class Data {
    void info() {
        System.out.println("hello m");
    }

    void display() {
        System.out.println("hello n");
        //m();//same as this.m()
        this.info();
    }
}
