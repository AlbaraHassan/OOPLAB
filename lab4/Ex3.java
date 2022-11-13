package lab4;

public class Ex3 {
    public static void main(String[] args) {
        Ex3LyyraCard cardPekka = new Ex3LyyraCard(20);
        Ex3LyyraCard cardBrian = new Ex3LyyraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("Pekka " + cardPekka);
        System.out.println("Brian " + cardBrian);
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("Pekka " + cardPekka);
        System.out.println("Brian " + cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("Pekka " + cardPekka);
        System.out.println("Brian " + cardBrian);
    }
}
