package curs6;

public class Bottle {
    private int totalCapacity = 2000; //(2000 ml)
    private int availableLiquid;
    private boolean open;

    public Bottle(int availableLiquid) {
        this.availableLiquid = availableLiquid;
        this.open = false;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    //- a method that returns the available liquid
    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClosed() {
        return !open;
    }

    //- a method that returns true/false if the bottle has more liquid
    public boolean hasMoreLiquid() {
        return totalCapacity - availableLiquid > 0;
    }

    //- a method that returns the empty capacity
    public boolean hasEmptyCapacity() {
        return availableLiquid == 0;
    }

    //- a method that opens the bottle and returns a message ("Bottle is opened")
    public String openTheBottle() {
        if (isClosed()) {
            this.open = true;
            return "Bottle is opened";
        } else {
            return "Bottle is already opened";
        }
    }

    //- a method that closes the bottle and returns a message
    public String closeTheBottle() {
        if (isOpen()) {
            this.open = false;
            return "Bottle is closed";
        } else {
            return "Bottle is already close";
        }
    }

    //- a method that drinks a specific amount of liquid  and returns a message
    public String drinkLiquid(int amount) {
        if (isClosed()){
            return "The bottle is closed";
        }
        if (amount>getAvailableLiquid()) {
            return "Not enough liquid to drink";
        }
        this.availableLiquid -= amount;
        return "Drinking " + amount ;
    }

    public String refillBottle(int amount) {
        if (isClosed()){
            openTheBottle();
        }
        else
        {
            return "Cannot refill because bottle is closed";
        }
        if (amount>getTotalCapacity()) {
            return "Too much liquid";
        }
        this.availableLiquid += amount;
        return "Bottle refilled with " + amount ;
    }


    public static void main(String[] args) {
        Bottle bottle = new Bottle(1500);

        System.out.println("Initial available liquid: " + bottle.getAvailableLiquid());
        if (bottle.hasMoreLiquid()) {
            System.out.println(bottle.openTheBottle());
            //System.out.println(bottle.drinkLiquid(1500));
            //System.out.println(bottle.drinkLiquid(1600));
            System.out.println(bottle.drinkLiquid(300));
            System.out.println(bottle.closeTheBottle());
        }
        if (bottle.hasEmptyCapacity()) {
            System.out.println("Bottle is empty-refill");
            System.out.println(bottle.refillBottle(1000));
            System.out.println(bottle.drinkLiquid(300));
            System.out.println(bottle.closeTheBottle());
        } else {
            System.out.println("After drinking available liquid: " + bottle.getAvailableLiquid());
        }
    }
}
