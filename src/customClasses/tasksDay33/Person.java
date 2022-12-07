package customClasses.tasksDay33;

public class Person {
    public String name;
    public int age;
    public char gender;
    public static boolean isHuman, hasNose, hasWings;
    public static int numberOfHead, numberOfEyes;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    public String eat(String food){
        return name + " is eating " + food;
    }
    public String drink(String drink){
        return name + " is drinking " + drink;
    }
    public void sleep(){
        System.out.println(name + " is sleeping!");
    }
    static {
        isHuman = true;
        hasNose = true;
        hasWings = false;
        numberOfEyes = 2;
        numberOfHead = 1;
    }

}
/*
3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()
 */