package overloading.employee;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private String id, jobTitle, salaryName, companyName;

    public Employee(String name, int age, char gender, String id, String jobTitle, String salaryName, String companyName) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salaryName = salaryName;
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getSalaryName() {
        return salaryName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalaryName(String salaryName) {
        this.salaryName = salaryName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(jobTitle + " " + name + " is working in " + companyName);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salaryName='" + salaryName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
