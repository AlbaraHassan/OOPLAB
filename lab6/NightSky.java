package lab6;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int numberOfStars = -1; // -1 Indicates nothing has been printed before

    public NightSky(double density){
        this(density, 20, 10);
    }
    public NightSky(int width, int height){
        this(0.1, width, height);
    }
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        Random random = new Random();
        String line = "";
        for(int i = 0; i< this.width; i++){
            if(random.nextDouble() <= this.density){
                line += "*";
                this.numberOfStars += 1;
            }else{
                line +=" ";
            }
        }
        System.out.println(line);
    }

    public void print(){
        this.numberOfStars = 0;
        for(int i = 0; i <= this.height; i++){
            this.printLine();
        }
    }

    public int starsInLastPrint(){
        return this.numberOfStars;
    }
}
