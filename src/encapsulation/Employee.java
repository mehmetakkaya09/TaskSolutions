package encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.equals("")){
            System.out.println("Invalid name!");
            return;
        }
        this.name = name;
    }

    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if (gender == 'f' ||gender == 'F' ||gender == 'm' ||gender == 'M'){
            this.gender = gender;
        }else {
            System.out.println("Invalid gender!");
            return;
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>=16 && age<=90){
            this.age = age;
        }else {
            System.out.println("Invalid age!");
            return;
        }

    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if (salary>0){
            this.salary = salary;
        }else {
            System.out.println("Invalid salary!");
            return;
        }
    }


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
