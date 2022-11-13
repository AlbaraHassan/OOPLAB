package lab4;

public class Ex3LyyraCard {
    private double balance;

    public Ex3LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4) {
            this.balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if (this.balance > 150) {
                this.balance = 150;
            }
        }
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
