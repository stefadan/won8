package curs7hw1;

public class Bic implements AdvertiseProvider{
    private String name = "Bic";
    @Override
    public String advertiseByFacebook() {
        return "On Facebook: pencils and others.";
    }

    @Override
    public String advertiseByEmail() {
        return "By email: pencils and others.";
    }

    @Override
    public String advertiseByPrint() {
        return "On newspapers: pencils and others.";
    }

    @Override
    public String getName() {
        return name;
    }
}
