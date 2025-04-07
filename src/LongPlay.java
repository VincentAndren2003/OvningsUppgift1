public abstract class LongPlay extends Recording {


    ///  Klassen LongPlay¨ ar en konkret subklass till Recording och representerar en
    /// typ av inspelning som har blivit popul¨ ar igen.
    /// Priset p˚a en LongPlay ber¨ aknas p˚a standardviset (inklusive slitage), men en
    /// egenhet ¨ ar att skivans v¨ arde ocks˚a ¨ okar ¨ over tid, med 5 kronor per ˚ar, vilket
    /// inneb¨ ar att en skiva fr˚an f¨ orra ˚aret skulle vara v¨ ard 5 kronor extra. En LP fr˚an
    /// 2020 med priset 90 kr och slitage (condition) 1 f˚ar ˚ar 2025 priset 34 kronor
    /// innan moms (90.0 ∗ 0.1 + (2025− 2020) ∗ 5.0).
    /// Klassen skall inneh˚alla f¨ oljande metoder:
    ///
    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }

    public double getPrice(){
        return price;
    }

    public String getType(){
        return "LP";
    }
}
