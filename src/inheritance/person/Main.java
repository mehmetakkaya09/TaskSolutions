package inheritance.person;

public class Main {
    public static void main(String[] args) {
        Tester t1 = new Tester("mehmet",'m',32,001,"QA",100000);
        Developer d1 = new Developer("Akkaya", 'M',33,002,"Developer",200000);
        Teacher tc1 = new Teacher("ayşe", 'F', 25,003,"Teacher",80000);
        Driver dr1 = new Driver("Fatma", 'f',35,004,"Driver",70000);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(tc1);
        System.out.println(dr1);
        t1.work();
        t1.testing();
        t1.creatingTicket();
        d1.coding();
        d1.fixingBugs();
        tc1.teaching();
        dr1.driving();




    }
}
