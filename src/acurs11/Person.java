package acurs11;

public class Person{
    String name;
    int age;
    HairColor hairColour;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public HairColor getHairColour() {
        return hairColour;
    }

    public Person(String name, int age, HairColor hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }
}
