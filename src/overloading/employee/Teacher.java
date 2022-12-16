package overloading.employee;

public class Teacher extends Employee{
    public Teacher(String name, int age, char gender, String id, String salaryName, String companyName) {
        super(name, age, gender, id, "Teacher", salaryName, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is explaining the topic in " + getCompanyName());
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", id='" + getId() + '\'' +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salaryName='" + getSalaryName() + '\'' +
                ", companyName='" + getCompanyName() + '\'' +
                '}';
    }
}
