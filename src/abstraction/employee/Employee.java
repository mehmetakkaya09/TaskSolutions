package abstraction.employee;

public abstract class Employee extends Person{
    private final int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, String country, String gender, int id, String jobTitle, double salary) {
        super(name, age, country, gender);
        this.id = id;

        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();


    @Override
    public String toString() {
        return "Tester{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge() +
                ", country='" + getCountry()+ '\'' +
                ", gender='" + getGender() + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
