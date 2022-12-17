package overloading.device;

public class TV extends Device{
    public TV(String brand, String model, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, hasBattery, hasPowerButton);
    }
    public void channelUp(){
        System.out.println(getBrand()+" " + " is channeling up");
    }
    public void channelDown(){
        System.out.println(getBrand()+" " + " is channeling down");
    }
    public String toString() {
        return "TV{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
