public interface Priceable {
    public abstract double getPrice();
    public abstract double getVAT();
    public default double getPriceWithVAT(){
        return getPrice() * (1 + getVAT());
    };
}
