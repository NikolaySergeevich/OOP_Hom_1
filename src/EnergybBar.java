public class EnergybBar extends Product{
    private String barName;

    public EnergybBar(String name, double price, int value, String barName) {
        super(name, price, value);
        this.barName = barName;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", barName, super.toString());
    }
}
