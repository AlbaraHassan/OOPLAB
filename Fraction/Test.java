package Fraction;

public class Test {
    public static void main(String[] args) {
        Fraction fr = new Fraction(20, 60);
        System.out.println(fr);
        fr.lowestTerms();
        System.out.println(fr);
        System.out.println(fr.divide());
    }
}
