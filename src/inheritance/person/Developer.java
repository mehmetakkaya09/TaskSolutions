package inheritance.person;

public class Developer extends Employee{
    public Developer(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void coding(){
        System.out.println(getJobTitle() + " " + getName() + " is coding");
    }
    public void fixingBugs(){
        System.out.println(getJobTitle() + " " + getName() + " is fixing bugs");
    }

}
