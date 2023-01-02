package abstraction.car;

public class CydeoCar extends Car implements AutoPilot, AutoPark,Flyable{
    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getYear()+" " + getMake() + " " +getClass().getSimpleName() + " "+ getModel() +" can park itself automatically!" );
    }

    @Override
    public void selfDrive() {
        System.out.println(getYear()+" " + getMake() + " " +getClass().getSimpleName() + " "+ getModel() +" has selfDrive feature!" );
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void fly() {
        System.out.println(getYear()+" " + getMake() + " " +getClass().getName() +" "+ getModel() +" can fly" );
    }
}
