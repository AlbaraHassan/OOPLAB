package lab9.file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    private String wholeFile = "";
    public Analysis(File file){
        try{
        Scanner reader = new Scanner(file);
        while(reader.hasNext()){
            this.wholeFile += reader.nextLine().trim() + "\n";
        }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public int lines(){
        System.out.println(this.wholeFile);
        return this.wholeFile.split("\n").length;
    }

    public int characters(){
        return this.wholeFile.length();
    }
}
