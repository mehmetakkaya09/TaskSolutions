package overloading.device;

public class MyDevices {

    public static void main(String[] args) {

        TV tv = new TV("LG", "Ultimate",20000,false,true);
        tv.channelDown();
        System.out.println(tv);
        Laptop laptop = new Laptop("Lenovo","IdeaPad",15000,true,true);
        laptop.turnOn();
        System.out.println(laptop);
        Samsung samsung = new Samsung("s20",35000, true,true);
        samsung.call(3124124124323l);
        System.out.println(samsung);

    }

}
