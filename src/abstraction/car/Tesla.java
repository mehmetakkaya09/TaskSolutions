package abstraction.car;

public class Tesla extends Car implements AutoPark, AutoPilot{
    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getYear()+" " + getMake() + " " +getClass().getName() + getModel() +" can park itself automatically!" );
    }

    @Override
    public void selfDrive() {
        System.out.println(getYear()+" " + getMake() + " " +getClass().getName() + getModel() +" has selfDrive feature!" );
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }
}
