package OvningsUppgift1;
// implements interface PriceableWithVAT6
public class Book extends Item {
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
