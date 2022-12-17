package overloading.animal;

public class Dog extends FriendlyAnimal{
    public Dog(String name, String breed, int age, char gender, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, age, gender, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+getName()+" is eating bone");
    }
}
