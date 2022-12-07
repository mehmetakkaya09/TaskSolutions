package customClasses;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
    public void checkBalance(){
        System.out.println("your balance is " + balance);
    }
    public void deposit(double amount){
        if (amount<=0){
            System.out.println("amount cannot be less than 0!");
            return;
        }
        balance+=amount;
        System.out.println("your new balance is " + balance);
    }
    public void withDraw(double amount){
        if (amount<=0){
            System.out.println("amount cannot be less than 0!");
            return;
        }
        if (amount>balance){
            System.out.println("amount cannot be greater than balance!");
            return;
        }
        balance-=amount;
        System.out.println("your new balance is " + balance);
    }

}
