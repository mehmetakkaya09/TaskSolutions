package customClasses;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        dog1.eat();

        System.out.println(dog1);
    }
}
