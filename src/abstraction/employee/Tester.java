package abstraction.employee;

public class Tester extends Employee{

    public Tester(String name, int age, String country, String gender, int id, String jobTitle, double salary) {
        super(name, age, country, gender, id, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }

    @Override
    public void eat() {
        System.out.println(getJobTitle()+" "+getName()+" is eating lunch");
    }



}
