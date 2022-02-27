package BasicAbsractionPractice;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercise 1: ");
        firstSubClass firstSubClass = new firstSubClass();
        secondSubClass secondSubClass = new secondSubClass();

        firstSubClass.message();
        secondSubClass.message();
        System.out.println();

        System.out.println("Exercise 2: ");
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}
