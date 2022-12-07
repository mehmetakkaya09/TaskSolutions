package customClasses.tasksDay33;

public class TestMainMethods {
    public static void main(String[] args) {
    CydeoStudent st1 = new CydeoStudent("Mehmet", 32,'m',001,'A',10,11);
        System.out.println(st1);
        st1.study();
        st1.attendClass();
        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();
        Circle c1 = new Circle(3,6);
        System.out.println(c1);
        Person p1 = new Person("Mehmet", 32, 'M' );
        System.out.println(p1);
        p1.sleep();
        System.out.println(p1.eat("banana"));
        System.out.println(p1.drink("tea"));
        System.out.println(Person.numberOfHead);
        System.out.println(Person.numberOfEyes);
        System.out.println(Person.hasNose);
        System.out.println("Person.hasWings = " + Person.hasWings);
        System.out.println("Person.isHuman = " + Person.isHuman);
        Iphone iphone1 = new Iphone("14 promax", 45000, "white", "large");
        System.out.println(iphone1);
        iphone1.faceTime("mehmet@mehmet");
        iphone1.faceTime(5555555555555l);
        iphone1.call(66666666666l);
        iphone1.text(33333333333333l);
        Address ad1 = new Address("7925 Jones Branch","Dr McLean", "Va",22012);
        System.out.println(ad1);
        Dog dog1 = new Dog("kangal","large",'M',5,"white");
        dog1.eat();
        dog1.play();
        dog1.sleep();
        System.out.println(dog1);
        System.out.println("" +Dog.numberOfLegs + Dog.numberOfEyes + Dog.numberOfWings + Dog.isFriendly);
        Car car1 = new Car("Toyota", "Corolla","gray",2020,550000);
        System.out.println(car1);
        car1.drive();
        System.out.println("Car.hasSeats = " + Car.hasSeats);
        System.out.println("Car.hasBattery = " + Car.hasBattery);
        System.out.println("Car.numberOfWheels = " + Car.numberOfWheels);



    }

}
