package my.vlong.java.trainning.collection.section2.ex9;

enum TColor {
    RED, GREEN, BLUE;

    // enum constructor called separately for each
    // constant
    private TColor() {
        System.out.println("Constructor called for : " +
                this.toString());
    }

    // Only concrete (not abstract) methods allowed
    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class GFG4 {
    public static void main(String[] args) {
        TColor c1 = TColor.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}
