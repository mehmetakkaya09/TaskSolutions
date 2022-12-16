package overloading.animal;

public class friendlyAnimal extends Animal{
    private boolean isWild, isFriendly, isPlayable;

    public friendlyAnimal(String name, String breed, int age, char gender, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, age, gender, size, color);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }
}
