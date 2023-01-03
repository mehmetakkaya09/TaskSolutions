package abstraction.device;

public class Desktop extends Computer{
    public Desktop(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" " + getModel() + " "+ " is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" " + getModel() + " "+ " is turning off");
    }
}
