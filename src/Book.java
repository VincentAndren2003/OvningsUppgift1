public class Book extends Item implements PriceableWithVAT6{

    private final String author;
    private final double price;
    private final boolean bound;

    public Book(String name, String author, double price, boolean bound){
        super(name); // Ensures the required parameter 'name' is passed to the Item constructor
        this.author = author;
        this.price = price;
        this.bound = bound;
    }


    private double price(){return price;}

    private boolean bound(){
        if(this.bound){
            return true;
        }
        return false;
    }

    private String author(){return author;}

    public double getPrice(){
        if (this.bound()){
            return price * 1.3;
        }
        return price;
    }

    public String getType(){return "Book"; }

    @Override
    public String toString(){
        return "name=" + getName() +
                ", author =" + this.author +
                ", bound=" + this.bound() +
                ", price=" + this.price;
    }

}
