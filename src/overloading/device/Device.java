package overloading.device;

public class Device {
    private String brand, model;
    private double price;
    public boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        if (brand.equals("") || brand.equals(" ") || brand == null) {
            System.err.println("Invalid Brand");
            System.exit(1);
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model.equals("") || model.equals(" ") || model == null) {
            System.err.println("Invalid Model");
            System.exit(1);
        }
        this.model = model;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid Price");
            System.exit(1);
        }
        this.price = price;
    }

    public void turnOn() {
        System.out.println(brand + " " + model + " is turning on");
    }
    public void turnOff() {
        System.out.println(brand + " " + model + " is turning off");
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
