package curs7hw2;

public class Duck implements Animal{
    @Override
    public String walk() {
        return "Duck walk";
    }

    @Override
    public String talk() {
        return "Duck talk";
    }

    @Override
    public String eat() {
        return "Duck eats";
    }

    @Override
    public String getName() {
        return "Duck";
    }
}
