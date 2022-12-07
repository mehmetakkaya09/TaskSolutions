package customClasses;

public class Dog {
    public String name;
    public char gender;
    public String breed;
    public String color;
    public String size;
    public int age;
    public void eat(){
        System.out.println(name + " is eating");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }
}
