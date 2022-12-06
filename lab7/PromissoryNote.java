package lab7;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loan;
    public PromissoryNote(){
        this.loan = new HashMap<>();
    }

    public void setLoan(String toWhom, double value){
        this.loan.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String Whose){
        return this.loan.get(Whose) == null? 0:this.loan.get(Whose);
    }
}
