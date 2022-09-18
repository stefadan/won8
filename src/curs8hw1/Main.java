package curs8hw1;

public class Main {

    public static void main(String[] args) {
        Product product = new Cosmetics(50, "Cream", "Hydrating cream day", 2, "white", 20.5);

        System.out.println(String.format("Product name %s, description: %s, price: %s, quantity: %s ",
                product.getName(),
                product.getDescription(),
                product.getPrice(),
                product.getQuantity()
        ));

        Cosmetics cosmetic = (Cosmetics) product;
        if (cosmetic instanceof Cosmetics) {
            System.out.println(String.format("Cosmetic color %s, weight: %s ",
                    cosmetic.getColor(),
                    cosmetic.getWeight()
            ));
        }

        Product productE = new Electronics(1000, "Personal computer", "Asus HDMI", 4, "laptop",
                30, 24, 2, 1);
        System.out.println(String.format("Product name %s, description: %s, price: %s, quantity: %s ",
                productE.getName(),
                productE.getDescription(),
                productE.getPrice(),
                productE.getQuantity()));

        Electronics electronic = (Electronics) productE;
        if (electronic instanceof Electronics) {
            System.out.println(String.format("Electronic weight: %s, length: %s, width %s",
                    electronic.getHeight(),
                    electronic.getLength(),
                    electronic.getWidth()
            ));

            Electronics elecronicF = new Fridge(900.00, "Refrigerator", "Fridge",
                    4, "Combi", 70, 60, 150, 15, -2);
            System.out.println(String.format("Electronic name: %s, description: %s, price: %s, quantity: %s ",
                    elecronicF.getName(),
                    elecronicF.getDescription(),
                    elecronicF.getPrice(),
                    elecronicF.getQuantity()));

            Fridge fridge = (Fridge) elecronicF;
            if (fridge instanceof Fridge) {
                System.out.println(String.format("Fridge temperature %s, ",
                        fridge.getTemperature()
                ));

                fridge.setTemperature(-4);

                System.out.println(String.format("Fridge new temperature %s, ",
                        fridge.getTemperature()
                ));

            }
        }
    }
}

