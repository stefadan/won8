package curs7hw1;

public class BT implements AdvertiseProvider{
    private String name = "Banca Transilvania";

    @Override
    public String advertiseByFacebook() {
        return "On Facebook.";
    }

    @Override
    public String advertiseByEmail() {
        return "By email about new financial services.";
    }

    @Override
    public String advertiseByPrint() {
        return "On paper Ideas for your savings.";
    }

    @Override
    public String getName() {
        return name;
    }
}
