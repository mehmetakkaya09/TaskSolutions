package overloading.animal;

public class Tiger extends WildAnimal{
    public Tiger(String name, String breed, int age, char gender, String size, String color, boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, age, gender, size, color, isWild, isFriendly, isPlayable);
    }

    @Override
    public void hunt() {
        System.out.println(getBreed()+" "+getName()+" is hunting deer");
    }
    public String toString() {
        return "Tiger{" +
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
