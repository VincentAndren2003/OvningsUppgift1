package OvningsUppgift1;

public class Book implements interface PriceableWithVAT6 {
    private String name;
    private String author;
    private double price;
    private boolean bound;

    public Book(String name, String author, double price, boolean bound){
        this.name = name;
        this.author = author;
        this.price = price;
        this.bound = bound;
    }


    private final double price(){
        return price;
    }

    private boolean bound(){
        if (bound){
            return true;
        }
        return false;
    }

    private String author(){
        return author;
    }

    public double getPrice(Book book){
        return price;
    }

    public String getType(){
        return "Book";
    }

}
