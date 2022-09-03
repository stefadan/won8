package curs6;

public class Product {
    private String name;
    private float price;
    private int quantity;
    private String category;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock(int quantity) {
        if (quantity > 0) {
            return true;
        }
        return false;
    }

    public boolean isCategory(String categ){
        if (this.category.equals(categ)){
            return true;
        }
        return false;

    }

    Product(String name, float price, int quantity, String category){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Violeta", (float) 42.2, 10, "Literatura");
        Product p2 = new Product("Matematica clasa a II-a", (float) 22.2, 12, "Manuale");
        Product p3 = new Product("Matematica clasa a III-a", (float) 25.2, 5, "Manuale");

        System.out.println("Product 1: "+p1.getName());
        System.out.println("Product 2: "+p2.getName());
        System.out.println("Product 3: "+p3.getName());

        if (p2.isCategory(p3.getCategory())) {
            System.out.println("Produsul "+p1.getName()+" si produsul "+p2.getName() + " au aceeasi categorie");
        }

    }

}