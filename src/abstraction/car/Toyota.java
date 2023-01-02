package abstraction.car;

public final class Toyota extends Car
{
    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getYear()+" " + getMake() + " " +getClass().getName() + getModel() +" is starting!" );
    }

    @Override
    public void drive() {
        System.out.println(getYear()+" " + getMake() + " " +getClass().getName() + getModel() +" is driving!" );
    }
}
