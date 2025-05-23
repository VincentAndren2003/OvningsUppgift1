public class Book extends Item implements PriceableWithVAT6 {

    private final String author;
    private final double price;
    private final boolean bound;

    public Book(String name, String author, double price, boolean bound) {
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    private boolean getBound() {
        return bound;
    }

    private String getAuthor() {
        return author;
    }

    public double getPrice() {
        if (bound) {
            return price * 1.3;
        }
        return price;
    }

    private String getType() {
        return "Book";
    }

    @Override
    public String toString() {
        return  getType() + ": " +
                "name=" + getName() +
                ", author =" + "'" + getAuthor() + "'" +
                ", bound=" + getBound() +
                ", price=" + getPrice() +
                ", price+vat=" + getPriceWithVAT();
    }

}
