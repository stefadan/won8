package curs7hw2;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "Dog walks";
    }

    @Override
    public String talk() {
        return "Bow-Wow";
    }

    @Override
    public String eat() {
        return "Dog eats";
    }

    @Override
    public String getName() {
        return "Dog";
    }
}
