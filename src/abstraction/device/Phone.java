package abstraction.device;

import abstraction.device.Device;

public abstract class Phone extends Device {
    public Phone(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum) {
        System.out.println(getBrand()+" "+getModel()+" is calling");
    }

    public void text(long phoneNum) {
        System.out.println(getBrand()+" "+getModel()+" is texting");
    }


}
