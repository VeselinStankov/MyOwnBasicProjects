package BasicAbsractionPractice;

public class BankA extends Bank{

    double balance = 100;
    @Override
    public double getBalance() {
        System.out.printf("BankA's balance is: %.2f\n",balance);
        return balance;
    }
}
