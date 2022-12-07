package customClasses.tasksDay33;

public class Dog {
    public String breed, size;
    public char gender;
    public int age;
    public String color;

    public static int numberOfLegs, numberOfEyes, numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, String size, char gender, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    static {
        numberOfLegs = 4;
        numberOfEyes = 2;
        numberOfWings = 0;
        isFriendly = true;
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void eat() {
        System.out.println(color + " " + breed + " is eating!");
    }
    public void sleep() {
        System.out.println(color + " " + breed + " is sleeping!");
    }
    public void play() {
        System.out.println(color + " " + breed + " is playing!");
    }
}
/*
6. Dog Task:
		1. Crplaye a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */
