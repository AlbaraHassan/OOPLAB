package lab8;

public class Ex1 {
    public static void main(String[] args) {

        //PART 1:
        CivilService cs = new CivilService();
        cs.work();
        cs.work();
        System.out.println(cs.getDaysLeft());

        //PART 2:
        MilitaryService ms = new MilitaryService(50);
        ms.work();
        ms.work();
        System.out.println(ms.getDaysLeft());

    }
}
