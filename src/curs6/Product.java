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
        return quantity > 0;
    }

    public boolean isCategory(String categ){
        return this.category.equals(categ);
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
        Product p3 = new Product("Matematica clasa a III-a", (float) 25.2, 0, "Manuale");

        System.out.println("Product 1: "+p1.getName()+" pret "+p1.getPrice());
        System.out.println("Product 2: "+p2.getName()+" pret "+p2.getPrice());
        System.out.println("Product 3: "+p3.getName()+" pret "+p3.getPrice());

        if (p2.isCategory(p3.getCategory())) {
            System.out.println("Produsul "+p2.getName()+" si produsul "+p3.getName() + " au aceeasi categorie");
        }

        System.out.println("Produsul "+(p3.hasStock(p3.getQuantity())? p3.getName()+" este in stoc": p3.getName()+" nu este in stoc"));

    }

}