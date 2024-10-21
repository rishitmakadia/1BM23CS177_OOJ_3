import java.util.*;

class Account {
    String acc_name, acc_no, acc_type;
    double balance;
    Account(String name, String no, String acc, double bal) {
        this.acc_name = name;
        this.acc_no = no;
        this.acc_type = acc;
        this.balance = bal;
    }
    void deposit(double amt) {
        balance = balance + amt;
        System.out.println("Deposit = "+ amt);
    }
    void withdraw(double amt) {
        if (amt>balance)
            System.out.println("Insufficient Balance");
        else{
            balance -= amt;
            System.out.println("Withdrawn Ammount = "+amt);
        }
    }
    void checkBalance() {
        System.out.println("Available Balance = "+balance);
    }
}
// The current account provides cheque book facility but no interest, minimum balance (service charge).
class CurAcct extends Account {
    CurAcct(String name, String no, double bal) {
        super(name, no, "Current Account", bal);
        if (bal < 5000) {
            System.out.println("Min Balance in Bank Account should be 5000\nService Charge of 100 rs will be charged for each month");
            this.balance = bal - 100.0;
        }
    }
    void cheque(double amt) {
        balance -= amt;
        System.out.println("Cheque Ammount = "+amt);
    }
}
// The savings account provides compound interest and withdrawal facilities but no cheque book facility
class SavAcct extends Account {
    SavAcct(String name, String no, double bal) {
        super(name, no, "Saving Account", bal);
    }
    void compInt(double r, double t) {
        double pri = balance;
        double interest = balance * (Math.pow((1 + (r * 0.01)), t) - 1);
        pri += interest;
        System.out.println("Interest Earned on "+r+"% for "+t+" years is "+interest);
        System.out.println("Balance after "+t+" years will be "+pri);
    }
}

class Lab_5{
    public static void main(String[] args) {
        // Saving Account
        SavAcct sa1 = new SavAcct("Rishit", "177", 35000);
        System.out.println("Name = "+sa1.acc_name+"\nAccount No. = "+sa1.acc_no+"\nAccount Type = "+sa1.acc_type);
        sa1.checkBalance();
        sa1.deposit(5000);
        sa1.withdraw(10000);
        sa1.checkBalance();
        sa1.compInt(7, 3);
        System.out.println();
        // Current Account
        CurAcct ca1 = new CurAcct("Richa", "315", 17000);
        System.out.println("Name = "+ca1.acc_name+"\nAccount No. = "+ca1.acc_no+"\nAccount Type = "+ca1.acc_type);
        ca1.checkBalance();
        ca1.cheque(3000);
        ca1.deposit(7000);
        ca1.checkBalance();
    }
}

