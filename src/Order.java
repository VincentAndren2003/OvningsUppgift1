import java.util.ArrayList;
import java.util.List;

public class Order {
    private final long orderNumber;
    private static long counter;
    private final List<Item> items = new ArrayList<Item>();

    public Order(Item... items) {
        for (Item item : items) {
            this.items.add(item);
        }
        counter ++;
        orderNumber = counter;
    }

    public String getReceipt() {
        StringBuilder receipt = new StringBuilder();
        receipt.append("Receipt for order #" + orderNumber+ "\n");
        receipt.append("------\n");
        for (Item item : items) {
            receipt.append(item + "\n");
        }
        receipt.append("Total excl. VAT:" + getTotalValue()+"\n");
        receipt.append("Total incl. VAT:" + getTotalValuePlusVAT() + "\n");

        return receipt.toString();
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
