package OvningsUppgift1;

public abstract class Item implements interface Priceable {
    String name;

    public Item(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
