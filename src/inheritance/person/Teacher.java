package inheritance.person;

public class Teacher extends Employee{
    public Teacher(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age, id, jobTitle, salary);
    }
    public void teaching(){
        System.out.println(getJobTitle() + " " + getName() + " is teaching");
    }
}
