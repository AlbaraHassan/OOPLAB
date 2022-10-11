import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        while(true){
            System.out.print("Enter your name: ");
            String name = reader.nextLine();
            if(name.equals("i will not")){
                break;
            }
            System.out.println(name);
        }
    }
}
