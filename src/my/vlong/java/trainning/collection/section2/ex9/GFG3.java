package my.vlong.java.trainning.collection.section2.ex9;

// Java program to demonstrate working of values(),
// ordinal() and valueOf()
enum MyColor {
    RED, GREEN, BLUE;
}

public class GFG3 {
    public static void main(String[] args) {
        // Calling values()
        MyColor arr[] = MyColor.values();

        // enum with loop
        for (MyColor col : arr) {
            // Calling ordinal() to find index
            // of color.
            System.out.println(col + " at index "
                    + col.ordinal());
        }

        // Using valueOf(). Returns an object of
        // Color with given constant.
        // Uncommenting second line causes exception
        // IllegalArgumentException
        System.out.println(MyColor.valueOf("RED"));
        // System.out.println(MyColor.valueOf("WHITE"));
    }
}
