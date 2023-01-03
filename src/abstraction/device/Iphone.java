package abstraction.device;

public class Iphone extends Phone implements Downloadable,AppleApps{
    public Iphone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
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

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" " + getModel() + " "+ " is downloading app from "+appStoreName);
    }
}
