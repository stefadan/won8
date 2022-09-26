package curs9hw1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Flower {

    //Create an objects that model buquet of flowers. Each flower has to be unique.
    // We don't care how the flowers are ordered
    //remove(String) - removes a flower


    public static void main(String[] args) {
        Flower flower = new Flower();
        Set<String> buchet;
        buchet = add("Rose", "Sunflower", "Lily", "Iris");
        flower.getAll(buchet);
        buchet.remove("Lily");
        System.out.println("Buchetul contine acum:"+flower.getAll(buchet));

    }

    public static Set<String> add(String... strings) {
        HashSet<String> set = new HashSet<String>();
        for (String s : strings) {
            set.add(s);
        }
        return set;
    }

    //getAll(): Collection<String>  - returns all the flowers
    public Collection<String> getAll(Set<String> b) {
        ArrayList<String> ar = new ArrayList<String>();
        for (String s : b) {
            System.out.println("Buchetul contine " + s);
            ar.add(s);
        }
        return ar;
    }


}
