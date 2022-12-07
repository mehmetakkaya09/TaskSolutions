package inheritance.person;

public class Driver extends Employee{
    public Driver(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void driving(){
        System.out.println(getJobTitle() + " " + getName() + " is driving");
    }
}
