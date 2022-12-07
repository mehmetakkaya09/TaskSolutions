package inheritance.person;

public class Employee extends Person {
    private int id;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, int age, int id, String jobTitle, double salary) {
        super(name, gender, age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);

    }

    public int getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("Invalid ID");
            return;
        } else
            this.id = id;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.equals("")) {
            System.out.println("Invalid Job Title");
            return;
        } else
            this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Invalid Salary");
            return;
        } else
            this.salary = salary;
    }
    public void work(){
        System.out.println(jobTitle + " " + getName() + " is working");
    }


    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
