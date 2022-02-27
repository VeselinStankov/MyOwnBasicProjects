package BasicAbsractionPractice;

public class BankB extends Bank {
    double balance = 150;
    @Override
    public double getBalance() {
        System.out.printf("BankB's balance is: %.2f\n",balance);
        return balance;
    }
}
