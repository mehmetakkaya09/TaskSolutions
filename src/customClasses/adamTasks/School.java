package customClasses.adamTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("Mehmet",'m',"25/10/1990",33,001,'A');
        Student student2 = new Student("Ahmet",'m',"30/5/1990",33,002,'B');
        Student student3 = new Student("Ayşe",'f',"30/5/1995",28,003,'C');
        ArrayList students = new ArrayList<>();
        students.addAll(Arrays.asList(student1,student2,student3));
        System.out.println(startsWithA(students));
    }
    public static ArrayList<Student> startsWithA(ArrayList<Student> list){
        list.removeIf(p->!p.name.startsWith("A"));
        return list;
    }
}
