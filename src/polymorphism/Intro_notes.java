package polymorphism;

import abstraction.animalTask.Animal;
import abstraction.animalTask.Dog;
import abstraction.animalTask.Playable;

public class Intro_notes {
    //reference type and object is different!
    //we can create object with the same reference type but then we cannot store these objects in the same list!!
    //for ex. if we have a DOG object and if we want to store it with the CAT object in the same list...then we have to declare its reference type as ANIMAL
    //we can access the methods and fields which we declare reference type!!
    //if there is no method inside the reference type(parent or interface) class..then we cannot reach these methods even if there is this method inside the created object class
    //for ex. when we call the dog object from animal class then we can reach just ANIMAL class methods, cannot be reached DOG class methods(like "bark()" )
    //but if this reference class methods is overridden methods with created object class methods then we can reach overridden methods of created object class!!!
    //for ex. if we call overridden eat() method from ANIMAL class(and the object class is DOG) then it will return us overridden method from DOG class
    //if we want to use polymorphism reference class and created object class must be PARENT-CHILD class(IS-A RELATIONSHIP) or INTERFACE
    //if the method is not overridden in created object class then reference class method get executed directly(same)!!
    public static void main(String[] args) {
        Animal dog1 = new Dog("lili","terrier",'F',2,"small","yellow");

        dog1.eat();//from Animal.. and overridden by Dog class
        //dog1.bark();  it cannot be called! because bark() method is not inside the Animal parent class
        //dog1.play(); it cannot called! because play() is not inside the Animal class even if it is inside the Dog class
        Dog dog2 = new Dog("lili","terrier",'F',2,"small","yellow");
        dog2.bark();
        dog2.play();
        dog2.eat();
        Playable dog3 = new Dog("lili","terrier",'F',2,"small","yellow");
        dog3.play();


    }
}
