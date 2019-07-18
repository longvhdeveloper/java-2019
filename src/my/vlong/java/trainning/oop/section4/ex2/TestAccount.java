package my.vlong.java.trainning.oop.section4.ex2;

public class TestAccount {
    public static void main(String[] args) {
        //creating instance of Account class
        Account acc = new Account();
        //setting values through setter methods
        acc.setAccNo(7560504000L);
        acc.setName("Sonoo Jaiswal");
        acc.setEmail("sonoojaiswal@javatpoint.com");
        acc.setAmount(500000f);
        //getting values through getter methods
        System.out.println(acc.getAccNo() + " " + acc.getName() + " " + acc.getEmail() + " " + acc.getAmount());
    }
}
