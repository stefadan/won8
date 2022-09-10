package curs7hw1;

public class Main {
    public static void main(String[] args) {
        //Company company = new Company(new BT(), 2);
        Company company = new Company(new Bic(), 3);
        company.publishAdvertise();
    }
}
