package BasicAbsractionPractice;

public class BankC extends  Bank{

    double balance = 200;
    @Override
    public double getBalance() {
        System.out.printf("BankC's balance is: %.2f\n",balance);
        return balance;
    }

}
