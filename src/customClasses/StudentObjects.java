package customClasses;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Mehmet Akkaya",'M',32,001,'A');
        student1.code();
        student1.sleep();
        System.out.println(student1);


    }
}
