package overloading.animal;

public class FriendlyAnimal extends Animal {
    public boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String breed, int age, char gender, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, age, gender, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void play() {
        System.out.println(getName() + " " + getBreed() + " is playing");
    }

    public void pet() {
        System.out.println(getName() + " " + getBreed() + " is a pet");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " " + getBreed() + " is eating friendly");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " " + getBreed() + " is drinking friendly");
    }



    @Override
    public void sleep() {
        System.out.println(getName() + " " + getBreed() + " is sleeping friendly");
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getBreed() + " is moving friendly");

    }

    @Override
    public String toString() {
        return "FriendlyAnimal{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                "isWild=" + isWild +
                ", isFriendly=" + isFriendly +
                ", isPlayable=" + isPlayable +
                '}';
    }
}
