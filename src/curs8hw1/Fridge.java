package curs8hw1;

public class Fridge extends Electronics{
    double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Fridge(double price, String name, String description, int quantity, String type, int length, int width, int height, int weight, double temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }
}
