package customClasses.tasksDay33;

public class Iphone {
    public String model;
    public double price;
    public String color;
    public String size;
    public static String brand, OS, madeIn;

    public Iphone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }
    public void faceTime(long phoneNumber){
        System.out.println(brand + model + " is making a facetime call with " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand + model + " is making a facetime call with " + email);
    }
    public void call(long phoneNumber){
        System.out.println(phoneNumber + " is calling now!");
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber + " is texting now!");
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", OS='" + OS + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }
    static {
        brand = "Iphone";
        OS = "IOS";
        madeIn = "China";
    }
}
/*

4. IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn

				Add a constructor that can set All the fields (instances)

				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */