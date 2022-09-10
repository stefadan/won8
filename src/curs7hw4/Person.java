package curs7hw4;

public class Person {
    private String nume;
    private String prenume;
    private BankProvider bankProvider;

    private int sumToAdd;
    private int sumToWihdraw;

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Person(BankProvider bankProvider, String nume, String prenume){
        this.bankProvider = bankProvider;
        this.nume = nume;
        this.prenume = prenume;
    }

    public void add(int amount){
        bankProvider.depositMoney(amount);
    }
    public void withdraw(int amount){
        bankProvider.withdrawMoney(amount);
    }

    public String getBankProvider() {
        return bankProvider.getName();
    }
    public int getPersonBalance(){
        return bankProvider.getPersonBalance();
    }
}
