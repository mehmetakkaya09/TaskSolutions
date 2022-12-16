package overloading.employee;

public class Main {

    public static void main(String[] args) {

        Developer developer = new Developer("Mehmet", 32, 'm', "a001","Cash", "Nasa" );
        System.out.println(developer);
        developer.work();
        Teacher teacher = new Teacher("Akkaya",33,'M',"a002","Private", "Harvard University");
        teacher.work();
        System.out.println(teacher);



    }



}
