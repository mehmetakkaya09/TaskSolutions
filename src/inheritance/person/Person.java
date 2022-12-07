package inheritance.person;

public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Invalid name");
            return;
        } else
            this.name = name;
    }

    public void setGender(char gender) {
        if (!(gender == 'f' || gender == 'F' || gender == 'm' || gender == 'M')) {
            System.out.println("Invalid Gender");
            return;
        } else
            this.gender = gender;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
            return;
        } else
            this.age = age;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
