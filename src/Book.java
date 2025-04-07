public class Book extends Item implements PriceableWithVAT6 {

    private final String author;
    private final double price;
    private final boolean bound;

    public Book(String name, String author, double price, boolean bound) {
        super(name); // Ensures the required parameter 'name' is passed to the Item constructor
        this.author = author;
        this.price = price;
        this.bound = bound;
    }

    public boolean getBound() {
        return bound;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        if (bound) {
            return price * 1.3;
        }
        return price;
    }

    public String getType() {
        return "Book";
    }

    @Override
    public String toString() {
        return  "Book: " +
                "name=" + getName() +
                ", author =" + "'" + getAuthor() + "'" +
                ", bound=" + getBound() +
                ", price=" + getPrice();
    }

}
