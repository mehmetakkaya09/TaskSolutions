package overloading.animal;

public class Animal {

    private String name, breed;
    private int age;
    private char gender;
    private String size, color;

    public Animal(String name, String breed, int age, char gender, String size, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setGender(gender);
        setSize(size);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        if (name.equals("")){
            System.out.println("Invalid Name");
            return;
        }
        this.name = name;
    }

    public void setBreed(String breed) {
        if (breed.equals("")){
            System.out.println("Invalid Breed");
            return;
        }
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age<0||age>30){
            System.out.println("Invalid Age");
            return;
        }
        this.age = age;
    }

    public void setGender(char gender) {
        if (!(gender=='f'||gender=='F'||gender=='M'||gender=='m')){
            System.out.println("Invalid Gender");
            return;
        }
        this.gender = gender;
    }

    public void setSize(String size) {
        if (size.equals("")){
            System.out.println("Invalid Size");
            return;
        }
        this.size = size;
    }

    public void setColor(String color) {
        if (color.equals("")){
            System.out.println("Invalid Color");
            return;
        }
        this.color = color;
    }

    public void eat(){
        System.out.println(name +" "+ breed + " is eating ");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
