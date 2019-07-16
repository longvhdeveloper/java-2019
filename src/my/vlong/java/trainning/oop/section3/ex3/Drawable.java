package my.vlong.java.trainning.oop.section3.ex3;

public interface Drawable {
    void draw();

    default void msg() {
        System.out.println("default method");
    }
}
