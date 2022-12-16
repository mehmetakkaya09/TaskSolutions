package overloading.employee;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, String id, String salaryName, String companyName) {
        super(name, age, gender, id, "Tester", salaryName, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing in " + getCompanyName());
    }

    @Override
    public String toString() {
        return "Tester{" +
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
