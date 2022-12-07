package customClasses.adamTasks;

public class Student {
    public String name;
    public char gender;
    public String dateOfBirth;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name, char gender, String dateOfBirth, int age, int studentID, char grade) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.studentID = studentID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }
}
/*
1. create a class named Student that has the followings features:
            Attributes:
                name, gender, dateOfBirth, age, studentID, grade

            Methods:
                sets all the attributes of the student object
                toString(): returns the full info of student Object

2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"

 */