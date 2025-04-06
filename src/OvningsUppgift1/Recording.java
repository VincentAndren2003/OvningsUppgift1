import src.OvningsUppgift1;

public class Recording extends Item implements PriceableWithVAT25 {

    private String artist;
    private int year;
    private int condition;
    private double price;

    public Recording (String name, String artist, int year, int condition, double price) {
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }
    public String getArtist() {
        return artist;
    }

    public String getType(){
        return "Type";
    }
}
