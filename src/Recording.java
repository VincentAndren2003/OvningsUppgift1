public abstract class Recording extends Item implements PriceableWithVAT25 {

    private final String artist;
    private final int year;
    private final int condition;
    private final double price;

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
        double calculatedPrice = price * (condition / 10d);
        if (calculatedPrice < 10d) {
            return 10d;
        }
        return calculatedPrice;
    }
}
