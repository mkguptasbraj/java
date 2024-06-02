class Account {
    String accountNumber;
    double balance;
public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    } public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {

        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interestAmount = balance * interestRate;
        deposit(interestAmount);
        System.out.println("Interest added. New balance: " + balance);
    }
}


class FixedAccount extends Account {
     int termMonths;


    public FixedAccount(String accountNumber, double initialBalance, int termMonths) {
        
        super(accountNumber, initialBalance);
        this.termMonths = termMonths;
    }
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Term (months): " + termMonths);
    }
}

public class lab4 {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("6666", 77.0, 12);
        s1.displayAccountDetails();
        
        s1.deposit(10000);
        s1.displayAccountDetails();
    }

}
