package lab8;

public class Ex2 {
    public static void main(String[] args) {
        Box box1 = new Box(6);
        Book book1 = new Book("James Bond", "The dead spy", 5);
        Book book2 = new Book("James Bond", "The spy of the spy", 5);
        CD cd1 = new CD("DJ Khalid", "The money and the expensive cars", 2022);
        CD cd2 = new CD("DJ Khalid", "Lots of luxury and golden watches and stuff", 2022);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(cd1);
        System.out.println(cd2);

        box1.add(book1);
        box1.add(book2);
        box1.add(cd1);
        box1.add(cd2);
        System.out.println(box1);
    }
}
