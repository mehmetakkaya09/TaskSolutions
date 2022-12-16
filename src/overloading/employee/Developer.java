package overloading.employee;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, String id, String salaryName, String companyName) {
        super(name, age, gender, id, "Developer", salaryName, companyName);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is writing program in " + getCompanyName());
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
