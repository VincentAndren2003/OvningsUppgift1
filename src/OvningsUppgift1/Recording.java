package src.OvningsUppgift1;

public class Recording extends Item implements PriceableWithVAT25 {

    private String artist;
    private int year;
    private int condition;
    private double price;

    public Recording (String name, String artist, int year, int condition, double price) {
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getType(){
        return "Type";
    }
    public String getArtist() {
        return artist;
    }
    public int getYear() {
        return year;
    }
    public int getCondition() {
        return condition;
    }
    public double getPrice() {
        return price;
    }
}
