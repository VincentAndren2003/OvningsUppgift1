import java.util.ArrayList;

public class Order {
    private final long orderNumber = 1;
    private static long counter;
    private final ArrayList<Item> items = new ArrayList<Item>();

    public Order(Item[] items){
        for(Item item : items){
            this.items.add(item);

        }
    }
    public String getReciept(){
        return "Reciept";
    }

    public double getTotalValuePlusVAT(){
        for(Item item : items){
            double totalPrice =+ item.getPrice();
        }
        return totalPrice * 1.25;
    }
    public double getTotalValue(){
        return getTotalValuePlusVAT() * 0.8;
    }
}
