package customClasses;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    double price;
    public void setInfo(String carbrand, String carModel, String carColor, int carYear, double carPrice){
        brand = carbrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
    public void drive(){
        System.out.println(brand + " " + model + " is driven!");
    }
    public void start(){
        System.out.println(brand + " " + model + " is started!");
    }
    public void stop(){
        System.out.println(brand + " " + model + " is stopped!");
    }
}
