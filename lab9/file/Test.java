package lab9.file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        Analysis analysis = new Analysis(new File("lab9/file/text.txt"));
        System.out.println("Lines: " + analysis.lines());
        System.out.println("Characters: " + analysis.characters());
    }
}
