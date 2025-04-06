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

    public String getType(){
        return "Book";
    }

    public int price(){
        return price;
    }

    public boolean bound(){
        if (boudn){
            return true;
        }
        return false;
    }

    public String author(){
        return author;
    }

    public void getPrice(Book book){
        prince = ....;
    }
}
