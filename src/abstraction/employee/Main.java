package abstraction.employee;

public class Main {
    public static void main(String[] args) {

        Tester tester = new Tester("Mehmet Akkaya",32, "Turkey", "m",001, "QA",200000);
        System.out.println(tester);
        tester.work();
        tester.eat();


    }

}
