package GradingProgram;

public class StringUtils {
    public static boolean included(String word, String searched){
        return word.toLowerCase().trim().contains(searched.toLowerCase().trim());
    }
}