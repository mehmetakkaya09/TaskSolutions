package inheritance.phone;

public class Phone {

    private String brand, model, size, color;
    private double price;

    public Phone(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        if (brand.equals("")) {
            System.out.println("Invalid Brand");
            return;
        } else
            this.brand = brand;
    }

    public void setModel(String model) {
        if (model.equals("")) {
            System.out.println("Invalid Model");
            return;
        } else
            this.model = model;
    }

    public void setSize(String size) {
        if (size.equals("")) {
            System.out.println("Invalid Size");
            return;
        } else
            this.size = size;
    }

    public void setColor(String color) {
        if (color.equals("")) {
            System.out.println("Invalid Color");
            return;
        } else
            this.color = color;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Invalid Price");
            return;
        } else
            this.price = price;
    }

    public void call(long phoneNumber) {
        System.out.println(brand + " " + model + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber) {
        System.out.println(brand + " " + model + " is texting " + phoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
