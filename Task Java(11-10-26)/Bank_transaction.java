class BankAccount {
    String name;
    int accNo;
    double balance;

    BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amt) { balance += amt; System.out.println("Deposit Successful"); }
    void withdraw(double amt) { balance -= amt; System.out.println("Withdrawal Successful"); }

    void display() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Final Balance: " + balance);
    }
}

public class Bank_transaction {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rahul", 1001, 5000);
        acc.deposit(2000);
        acc.withdraw(1500);
        acc.display();
    }
}