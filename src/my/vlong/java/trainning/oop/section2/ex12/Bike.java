package my.vlong.java.trainning.oop.section2.ex12;

public class Bike {
    final int speedlimit = 90;//final variable

    void run() {
        //speedlimit = 400; // it will error
    }

    public static void main(String args[]) {
        Bike obj = new Bike();
        obj.run();
    }
}
