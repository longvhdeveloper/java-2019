package my.vlong.java.trainning.oop.section1.ex16;

public class S2 {
    void m(S2 obj) {
        System.out.println("method is invoked");
    }

    void p() {
        m(this);
    }

    public static void main(String[] args) {
        S2 s1 = new S2();
        s1.p();
    }
}
