package lab8;

import java.util.Scanner;

public class Shop {
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        if (this.store.products().size() == 0) {
            System.out.println("The store is empty, come back another time !");
            return;
        }
        System.out.println("below is our sales offer: ");
        for (String product : store.products()) {
            System.out.println(product);
        }
        while (true) {
            System.out.println("What do you want to buy (press enter to pay): ");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
            try {
                if (!this.store.take(product)) {
                    System.out.println(product + " is not available in stock");
                    continue;
                }
                basket.add(product, this.store.stock(product));
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("\n\nYour purchases are: ");
            basket.print();
            System.out.println("Basket price: " + basket.price());
        }
    }
}
