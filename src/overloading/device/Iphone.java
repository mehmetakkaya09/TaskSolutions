package overloading.device;

public class Iphone extends Phone{
    public Iphone(String model, double price, boolean hasBattery, boolean hasPowerButton) {
            super("Iphone", model, price, hasBattery, hasPowerButton);
    }
    public String toString() {
        return "Iphone{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
