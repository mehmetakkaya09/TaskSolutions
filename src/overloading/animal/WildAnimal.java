package overloading.animal;

public class WildAnimal extends Animal {
    public boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, int age, char gender, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, age, gender, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }
    @Override
    public void eat() {
        System.out.println(getName() + " " + getBreed() + " is eating everything");
    }

    @Override
    public void drink() {
        System.out.println(getName() + " " + getBreed() + " is drinking everything");
    }



    @Override
    public void sleep() {
        System.out.println(getName() + " " + getBreed() + " is sleeping deep");
    }

    @Override
    public void move() {
        System.out.println(getName() + " " + getBreed() + " is moving speedy");

    }
    public void hunt(){
        System.out.println(getBreed()+getName()+" is hunting");
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
