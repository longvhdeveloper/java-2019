package my.vlong.java.trainning.collection.section2.ex10;

public class GFG1 {
    public static void main(String[] args) {
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x) -> System.out.println(2 * x);

        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
    }
}
