public class bank {
    int accno;
    String name;
    float balance;
    int age;

    bank(int a, String n, float b, int ag) {
        accno = a;
        name = n;
        balance = b;
        age = ag;
        System.out.println("Welcome to the bank");
    }

    void deposit(float amt) {
        balance = balance + amt;
        System.out.println("Balance after deposit=" + balance);
    }

    void withdraw(float amt) {
        if (amt > balance)
            System.out.println("Insufficient balance");
        else {
            balance = balance - amt;
            System.out.println("Balance after withdraw=" + balance);
        }
    }

    void display() {
        System.out.println("Account no=" + accno);
        System.out.println("Name=" + name);
        System.out.println("Balance=" + balance);
    }

    public static void main(String args[]) {
        bank b1 = new bank(1001, "Raj", 1000, 20);
        System.out.println("deposit ");
        b1.deposit(500);
        System.out.println("Withdraw ");
        b1.withdraw(200);
        System.out.println("Display");
        b1.display();
    }

}
