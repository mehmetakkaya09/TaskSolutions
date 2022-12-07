package encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("", 'y', 0, -32);
        employee1.setSalary(100000);
        employee1.setName("mehmet");
        employee1.setAge(32);
        employee1.setGender('m');
        System.out.println(employee1);
        System.out.println("employee1.getAge() = " + employee1.getAge());
        System.out.println("employee1.getName() = " + employee1.getName());
        System.out.println("employee1.getGender() = " + employee1.getGender());
        System.out.println("employee1.getSalary() = " + employee1.getSalary());
        Square s1 = new Square(5);
        System.out.println("s1 = " + s1);
        System.out.println("s1.calcPerimeter() = " + s1.calcPerimeter());
        System.out.println("s1.calcArea() = " + s1.calcArea());
        Rectangle r1 = new Rectangle(5, 6);
        System.out.println(r1);
        Carpet c1 = new Carpet(4, 3, 10, false);
        System.out.println("c1 = " + c1);
        Items i1 = new Items("toilet paper",10,-2);
        System.out.println(i1);
        Pizza p1 = new Pizza("small",-1,2);
        System.out.println(p1);
        Credentials cr1 = new Credentials("djsdkcnskjn", "class23pascal");
        System.out.println(cr1);
        System.out.println(cr1.isStrongPassword("*class23pascal"));
        BankAccount ac1 = new BankAccount("mehmet", 123456, 1000000);
        System.out.println(ac1);
        ac1.deposit(1000);
        ac1.checkBalance();
        ac1.withDraw(500);
        ac1.checkBalance();


    }
}
