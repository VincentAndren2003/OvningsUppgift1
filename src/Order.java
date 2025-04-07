import java.util.ArrayList;
import java.util.List;

public class Order {
    private final long orderNumber;
    private static long counter;
    private final List<Item> items = new ArrayList<Item>();

    public Order(Item[] items) {
        for (Item item : items) {
            this.items.add(item);
        }
        counter ++;
        orderNumber = counter;
    }

    public String getReciept() {
        StringBuilder reciept = new StringBuilder();
        reciept.append("Receipt for order #" + orderNumber);
        reciept.append("\n------");
        for (Item item : items) {
            reciept.append(item + "\n");
        }
        reciept.append("Total excl. VAT:" + getTotalValue());
        reciept.append("\n Total incl. VAT." + getTotalValuePlusVAT());

        return reciept.toString();
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
