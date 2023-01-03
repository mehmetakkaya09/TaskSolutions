package abstraction.device;

public abstract class Device {
    private final String brand, model, size;
    private double price;
    private String color;
    public boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String size, double price, String color, boolean hasBattery, boolean hasPowerButton) {
        strings(brand);
        this.brand = brand;
        strings(model);
        this.model = model;
        strings(size);
        this.size = size;
        this.price = price;
        this.color = color;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    private void strings(String arg) {
        if (arg.equals("")||arg == null ) {
            throw new RuntimeException("Invalid Enter : " + getClass().getTypeName());
        }
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(double price) {
        if (price<=0) {
            throw new RuntimeException("Invalid Price: "+ price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        strings(color);
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
