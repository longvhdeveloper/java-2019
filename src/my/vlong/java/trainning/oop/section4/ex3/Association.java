package my.vlong.java.trainning.oop.section4.ex3;

public class Association {
    public static void main(String[] args) {
        Bank bank = new Bank("Axis");
        Employee emp = new Employee("Neha");

        System.out.println(emp.getEmployeeName() +
                " is employee of " + bank.getBankName());
    }
}
