package OvningsUppgift1;

public class Recording extends OvningsUppgift1.Item {

    private String artist;
    private int year;
    private int condition;
    private double price;

    public Recording (String name, String artist, int year, int condition, double price) {
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
