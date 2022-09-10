package curs7hw2;

public class Cat implements Animal{
    @Override
    public String walk() {
        return "Cat walk";
    }

    @Override
    public String talk() {
        return "Cat mioww";
    }

    @Override
    public String eat() {
        return "Cat eats";
    }

    @Override
    public String getName() {
        return "Cat";
    }
}
