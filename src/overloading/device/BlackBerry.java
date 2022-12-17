package overloading.device;

public class BlackBerry extends Phone{
    public BlackBerry(String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super("BlackBerry", model, price, hasBattery, hasPowerButton);
    }
    public String toString() {
        return "BlackBerry{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
