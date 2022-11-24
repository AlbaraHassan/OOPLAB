package Fraction;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) throw new Error("Denominator cannot be 0!");
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double divide() {
        return (double) this.numerator / (double) this.denominator;
    }

    public void lowestTerms() {
        int div = this.gcd(this.numerator, this.denominator);
        this.numerator /= div;
        this.denominator /= div;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : this.gcd(b, a % b);
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

}
