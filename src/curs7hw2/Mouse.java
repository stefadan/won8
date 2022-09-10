package curs7hw2;

public class Mouse implements Animal{
    @Override
    public String walk() {
        return "Mouse walk";
    }

    @Override
    public String talk() {
        return "Mouse talks";
    }

    @Override
    public String eat() {
        return "Mouse eats";
    }

    @Override
    public String getName() {
        return "Mouse";
    }
}
