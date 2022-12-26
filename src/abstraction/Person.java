package abstraction;

public abstract class Person {

    private String name;
    private int age;
    private String country;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        if (name.equals("")){
            throw new RuntimeException("Invalid name!");
        }
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void eat();


    public Person(String name, int age, String country, String gender) {
        setName(name);
        setAge(age);
        setCountry(country);
        setGender(gender);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
