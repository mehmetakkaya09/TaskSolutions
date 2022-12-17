package overloading.device;

public class Nokia extends Phone{
    public Nokia(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, price, hasBattery, hasPowerButton);
    }
    public String toString() {
        return "Nokia{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
