import OvningsUppgift1.src.Item;

public class Book extends Item {
    private String author;
    private double price;
    private boolean bound;

    public Book(String name, String author, double price, boolean bound){
        super(name);
        this.author = author;
        this.price = price;
        this.bound = bound;
    }


    private double price(){
        return price;
    }

    private boolean bound(){
        if (this.bound){
            return true;
        }
        return false;
    }

    private String author(){
        return author;
    }

    public double getPrice(){
        if (this.bound()){
            return price * 1.3;
        }
        return price;
    }

    public String getType(){
        return "Book";
    }

}
