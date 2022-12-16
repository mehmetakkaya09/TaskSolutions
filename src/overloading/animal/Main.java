package overloading.animal;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Pamuk","Tekir",10,'m',"Medium","Gray");
        System.out.println(cat1);
        cat1.eat();
    }
}
