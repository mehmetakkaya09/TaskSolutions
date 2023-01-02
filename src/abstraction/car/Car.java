package abstraction.car;

public abstract class Car {
    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if (make.equalsIgnoreCase("") || make == null) {
            throw new RuntimeException("Invalid Make");
        }
        this.make = make;
        if (model.equalsIgnoreCase("") || model == null) {
            throw new RuntimeException("Invalid Model");
        }
        this.model = model;
        if (year<1986) {
            throw new RuntimeException("Invalid Year : " + year);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(double price) {
        if (price<=0) {
            throw new RuntimeException("Invalid Price: " +price);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("") || color == null) {
            throw new RuntimeException("Invalid Color");
        }
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println(year+" "+make+" "+model+" " + " is stopping");
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }


}
