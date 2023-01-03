package abstraction.device;

public class Shop {
    public static void main(String[] args) {
        Samsung samsung = new Samsung("Samsung","s20","max",30000,"night-blue",true,true);
        System.out.println(samsung);
        samsung.downloadApp();
        samsung.turnOn();
        samsung.turnOff();
        Laptop laptop = new Laptop("ASUS","X550V","15.6'",25000,"Black-Red", true,true);
        System.out.println(laptop);
        laptop.turnOn();
        laptop.turnOff();
    }
}
