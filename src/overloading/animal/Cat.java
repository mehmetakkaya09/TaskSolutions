package overloading.animal;

public class Cat extends Animal{
    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() +" "+ getBreed() + " is eating cat food");

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
