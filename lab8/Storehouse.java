package lab8;

import java.util.HashMap;
import java.util.Set;

public class Storehouse {

    private HashMap<String, Integer> productPrice;
    private HashMap<String, Integer> productStock;

    public Storehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }

    public int price(String product) throws Exception {
        this.checkIfExists(product);
        return this.productPrice.get(product);
    }

    public int stock(String product) throws Exception {
        this.checkIfExists(product);
        return this.productStock.get(product);
    }

    public boolean take(String product) throws Exception {
        this.checkIfExists(product);
        int stock = this.productStock.get(product);
        if (stock > 0) {
            this.productStock.put(product, stock - 1);
            return true;
        }
        return false;
    }

    private void  checkIfExists(String product) throws Exception{
        if (this.productStock.get(product) == null) throw new Exception("Product " + product + " Does Not Exist");

    }

    public Set<String> products() {
        return this.productPrice.keySet();

    }
}
