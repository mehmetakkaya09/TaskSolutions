package overloading.animal;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Pamuk","Tekir",10,'m',"Medium","Gray",false,true,true);
        System.out.println(cat1);
        cat1.eat();
        Tiger tiger = new Tiger("çaça","bengal",5,'f',"large","black-yellow",true,false,false);
        System.out.println(tiger);
        tiger.hunt();
    }
}

/*
Animal Task:
1. Create a class named Animal:
variables:
name, breed, gender, age, size, color
Encapsulate all the fields
Add a constructor to set all the fields
Conditions:
1. name, breed
and color can not be null (if obj == null means it's error)
2. name, breed
and color can not be empty or can not be blank
3. gender should
only be set to either 'M' or 'F'
4. age can not be
set to negative
Methods:
eat()
drink()
sleep()
move()
toString()
2. Create a sub class of Animal named FriendlyAnimal:
Variable:
isWild
isFriendly
isPlayable
Extra methods:
play()
pet()
3. Create a sub class of Animal named WildAnimal:
Variable:
isWild,
isFriendly, isPlayable
Extra Methods:
hunt()
4. Create the following sub classes of FriendlyAnimal and Override
the eat method
1. Dog:
Extra methods:
bark()
2. Cat:
Extra methods:
scratch()
meow()
3. Dolphin:
Extra methods:
swim()
4. Parrot:
Extra methods:
fly()
sing()
5. Create the following sub classes of WildAnimal and Override the
hunt method, and add any extra methods that are needed:
1. Lion
2. Tiger
3. Eagle
4. Bear
5. Python
6. Crocodile
6. Create a class named Zoo:
Create the objects of each sub classes and
test all the functions of each objects
Analyze the relationships between the classes
 */
