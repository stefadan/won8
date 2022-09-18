package curs8hw1;

public class Electronics extends Product{
    String type;
    int length;
    int width;
    int height;
    int weight;

    public String getType() {
        return type;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Electronics(double price, String name, String description, int quantity, String type, int length, int width, int height, int weight) {
        super(price, name, description, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}
