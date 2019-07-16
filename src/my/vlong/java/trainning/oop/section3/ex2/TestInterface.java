package my.vlong.java.trainning.oop.section3.ex2;

public class TestInterface implements Printable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        testInterface.print();
    }
}
