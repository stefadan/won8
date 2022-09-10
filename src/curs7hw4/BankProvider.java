package curs7hw4;

public interface BankProvider {
    public void depositMoney(int amount);
    public void withdrawMoney(int amount);
    public String getName();
    public int getPersonBalance();
}
