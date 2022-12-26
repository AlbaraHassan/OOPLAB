package lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {

    private File file;
    private Scanner reader;

    public Printer(String filename){ //No need to add throws key word because the exception is handled
        try {
            this.file = new File(filename);
            this.reader  = new Scanner(this.file);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void printLinesWhichContain(String word){
        while (this.reader.hasNext()){
            String line = reader.nextLine();
            System.out.print(line.contains(word)? line + "\n":"");
        }
    }
}
