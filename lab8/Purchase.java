package lab8;

import java.util.Objects;

public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;

    public Purchase(String product, int unitPrice){
        this(product, 1, unitPrice);
    }
    public Purchase(String product, int amount, int unitPrice){
        this.product = product;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }
    public int price(){
        return this.unitPrice * this.amount;
    }

    public void increaseAmount(){
        this.amount++;
    }

    public String product(){
        return this.product;
    }

    public boolean equals(Purchase purchase1){
        return Objects.equals(purchase1.product(), this.product());
    }


    @Override
    public String toString(){
        return this.product + ": " + this.amount;
    }
}
