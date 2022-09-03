package curs6;

public class Person {
    private String name;
    private byte age;
    private boolean married;

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    Person(String name, byte age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ion", (byte) 20, true);
        Person p2 = new Person("Iona", (byte) 30, false);
        Person p3 = new Person("Ioan", (byte) 24, true);

        System.out.println("Person 1 name " + p1.getName() + " age " + p1.getAge() + (p1.isMarried()?" maried": " not married"));
        System.out.println("Person 2 name " + p2.getName() + " age " + p2.getAge() + (p2.isMarried()?"married ": " not married"));
        System.out.println("Person 3 name " + p3.getName() + " age " + p3.getAge() + (p3.isMarried()?" married ":" not married"));

    }


}
