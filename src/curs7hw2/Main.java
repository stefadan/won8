package curs7hw2;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        System.out.println(String.format("Animal %s : %s %s %s ",
                animal.getName(),
                animal.eat(),
                animal.walk(),
                animal.talk()
                ));
        Animal animal1 = new Dog();
        System.out.println(String.format("Animal %s : %s %s %s ",
                animal1.getName(),
                animal1.eat(),
                animal1.walk(),
                animal1.talk()
        ));

        Animal animal2= new Mouse();
        System.out.println(String.format("Animal %s : %s %s %s ",
                animal2.getName(),
                animal2.eat(),
                animal2.walk(),
                animal2.talk()
        ));

        Animal animal3= new Chicken();
        System.out.println(String.format("Animal %s : %s %s %s ",
                animal3.getName(),
                animal3.eat(),
                animal3.walk(),
                animal3.talk()
        ));

        Animal animal4= new Duck();
        System.out.println(String.format("Animal %s : %s %s %s ",
                animal4.getName(),
                animal4.eat(),
                animal4.walk(),
                animal4.talk()
        ));

    }
}
