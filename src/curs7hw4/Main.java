package curs7hw4;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(new ING(), "Marin", "Isabela");
        System.out.println(String.format("Client %s %s has bank provider %s",
                person.getNume(),
                person.getPrenume(),
                person.getBankProvider()
                ));
                //person.add(0);
                //person.withdraw(50);
            person.add(100);
            person.withdraw(50);

        Person person1 = new Person(new BT(), "Marin", "Roxana");
        System.out.println(String.format("Client %s %s has bank provider %s",
                person1.getNume(),
                person1.getPrenume(),
                person1.getBankProvider()
        ));
        //person1.add(0);
        //person1.withdraw(50);
        person1.add(100);
        person1.withdraw(800);
        person1.getPersonBalance();


        Person person2 = new Person(new BRD(), "Popa", "Andrei");
        System.out.println(String.format("Client %s %s has bank provider %s",
                person2.getNume(),
                person2.getPrenume(),
                person2.getBankProvider()
        ));
        //person2.add(0);
        //person2.withdraw(50);
        person2.add(500);
        person2.withdraw(30);



    }
}
