public class LongPlay extends Recording {
    private double price;

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
        this.price = price;
    }

    public double getPrice(){
        return getPrice() + (2025 - getYear())*5 ;
    }

    public String getType() {
        return "LP";
    }
}
