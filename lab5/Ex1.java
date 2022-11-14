package lab5;

public class Ex1 {
    public static void main(String[] args) {
        Ex1Team barcelona = new Ex1Team("FC Barcelona");
        Ex1Player brian = new Ex1Player("Brian");
        Ex1Player pekka = new Ex1Player("Pekka", 39);
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Ex1Player("Mikael", 1)); // works similarly as the above
        System.out.println("Total goals: " + barcelona.goals());
    }
}