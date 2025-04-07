import java.util.ArrayList;

public class Order {
    private final long orderNumber = 1;
    private static long counter;
    private final ArrayList<Item> items = new ArrayList<Item>();

    public String getReciept(){
        return "Reciept";
    }
    public double getTotalValuePlusVAT(){
        return 1;
    }
    public double getTotalValue(){
        return 1;
    }
}
