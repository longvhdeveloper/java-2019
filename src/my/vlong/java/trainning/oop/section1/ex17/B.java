package my.vlong.java.trainning.oop.section1.ex17;

public class B {
    A4 obj;

    B(A4 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);//using data member of A4 class
    }
}
