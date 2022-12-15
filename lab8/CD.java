package lab8;

public class CD implements ToBeStored{

    private String artist;
    private String title;
    private double weight;
    private int publishingYear;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.weight = 0.1;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString(){
        return this.artist + ": " + this.title;
    }
}
