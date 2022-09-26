package curs9hw1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket {
        static List<String> basket = new ArrayList<String>();
        public static void main(String[] args) {
            basket.add("Apple");
            basket.add("Peach");
            basket.add("Pear");
            basket.add("Orange");

            Basket basket = new Basket();

            System.out.println(String.format("Found: %s ", basket.find("Peach") ? "Found" : "Notfound"));
            System.out.println(String.format("Removed: %s ", basket.remove("Peach") ? "Removed" : "Notremoved"));
            System.out.println(String.format("Position: %s ", basket.position("Orange")));
            basket.add("Pear");
            System.out.println(String.format("Number of fruits: %s ", basket.count()));
            System.out.println(String.format("Custom count: %s ", basket.customCount()));
            System.out.println(String.format("Number of distinct fruits: %s ", basket.distinct()));
        }

        public boolean find(String fruit){
            //finds if received fruit is in the list and returns true/false
           return basket.indexOf(fruit)>0;
        }

        public boolean remove(String fruit){
            //removes the received string returns true/false if found
            if (basket.remove(fruit)) {
                return true;
            }
            return false;
        }

        public int position(String fruit){
            //returns the position on which the received fruit is in the basket
            return basket.indexOf(fruit);
        }

        public void add(String fruit)
        {
           //adds a fruit to the basket
            basket.add(fruit);
        }

        public int count()
        {
            //count():int    - count the fruits
            return basket.size();
        }

        public int customCount(){
            int p = 0;
            //customCount():int - count the fruits without using size method (use a loop control statement + counter)
            for (String i: basket){
                p++;
            }
            return p;
        }

        public Collection distinct() {
            HashSet hs = new HashSet<String>(basket);
            //distinct(): Collection<String>  - returns an unique collection containing all fruits once
            return hs;
        }
}
