package customClasses.tasksDay33;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public int id;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName = "CYDEO", programmingLanguage = "Java";

    public CydeoStudent(String name, int age, char gender, int id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }
    public void study(){
        System.out.println(name + " is studying now!");
    }
    public void attendClass(){
        System.out.println(name + " attended the class!");
    }
    public static void printSchoolName(){
        System.out.println(schoolName);
    }
    public static void printProgLanguage(){
        System.out.println(programmingLanguage);
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */