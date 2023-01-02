package abstraction.car;

public class Mercedes extends Car implements AutoPark{
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {
        System.out.println(getYear()+" " + getMake() + " " +getClass().getName() + getModel() +" can park itself automatically!" );
    }
}
