package customClasses;

public class BankCustomers {
    public static void main(String[] args) {
        BankAccount customer1 = new BankAccount();
        customer1.setInfo("Mehmet Akkaya", 11110000);
        customer1.balance = 1_000_000;
        System.out.println(customer1);
        customer1.deposit(100000);
        customer1.checkBalance();
        customer1.withDraw(50000);
        customer1.checkBalance();

    }
}
