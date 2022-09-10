package curs7hw2;

public class Chicken implements Animal{
    @Override
    public String walk() {
        return "Chicken walk";
    }

    @Override
    public String talk() {
        return "Chicken talk";
    }

    @Override
    public String eat() {
        return "Chicken eats";
    }

    @Override
    public String getName() {
        return "Chicken";
    }
}
