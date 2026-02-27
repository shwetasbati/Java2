class ATM {

    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

   
    void withdraw(double amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}

public class ATMB{
    public static void main(String[] args) {

        ATM atm = new ATM(5000);

        atm.withdraw(2000);   
       
    }
}