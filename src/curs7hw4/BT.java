package curs7hw4;

public class BT implements BankProvider {
    private String NAME = "BT";
    private int balance;

    @Override
    public void depositMoney(int amount) {
        if (amount <= 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        balance = balance + amount;
        System.out.println(String.format("Balance after adding %d is %d", amount, getPersonBalance()));

    }

    @Override
    public void withdrawMoney(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient funds");
        }
        System.out.println(String.format("Balance after withdraw %d is %d", amount, getPersonBalance()));
    }

    @Override
    public String getName() {
        return NAME;
    }

    public int getPersonBalance() {
        return balance;
    }
}
