import java.util.ArrayList;
import java.util.List;

public class Order {
    private final long orderNumber = 1;
    private static long counter;
    private final List<Item> items = new ArrayList<Item>();

    public Order(Item[] items) {
        for (Item item : items) {
            this.items.add(item);
        }
    }

    public String getReciept() {
        return "Reciept";
    }

    public double getTotalValuePlusVAT() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPriceWithVAT();
        }
        return totalPrice;
    }

    public double getTotalValue() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
