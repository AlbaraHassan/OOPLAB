package lab8;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private List<Purchase> items = new ArrayList<>();

    public void add(String product, int price) {
        Purchase purchase = new Purchase(product, price);
        if(this.contains(purchase) == -1) this.items.add(purchase);
        else this.items.get(this.contains(purchase)).increaseAmount();
    }

    private int contains(Purchase purchase){
        for(int i = 0; i < this.items.toArray().length; i++){
            if(this.items.get(i).equals(purchase)) return i;
        }
        return -1;
    }

    public int price() {
        int total = 0;
        for (Purchase p : items) {
            total += p.price();
        }
        return total;
    }

    public void print() {
        for (Purchase p : this.items) System.out.println(p);
    }


}
