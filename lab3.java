
class Account {
    int acc;

    Account(int acc) {
        this.acc = acc;
    }

    public void print1() {
        System.out.println("account number:" + acc);
    }

}

class Saving extends Account {
    double amount;

    Saving(int acc, double amount) {
        super(acc);
        this.amount = amount;
    }

    public void print2() {
        System.out.println("balance of your account " + amount);
    }
}

public class lab3 {
    public static void main(String[] args) {
        Saving q1 = new Saving(11, 111111);
        q1.print1();
        q1.print2();
    }
}
