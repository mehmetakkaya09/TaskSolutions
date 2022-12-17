package overloading.animal;

public class Cat extends FriendlyAnimal{
    public Cat(String name, String breed, int age, char gender, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, age, gender, size, color, isWild, isFriendly, isPlayable);
    }
    public void scratch(){
        System.out.println(getBreed()+getName()+" is scratching");
    }
    public void meow(){
        System.out.println(getBreed()+getName()+" is meowing");
    }

    @Override
    public void eat() {
        System.out.println(getBreed()+getName()+" is eating cat food");
    }
    public String toString() {
        return "Cat{" +
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
