package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Grades {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59
        gradeOfA.removeIf(p -> !(p >=90 && p <=100));
        gradeOfB.removeIf(p -> !(p >=80 && p <=89));
        gradeOfC.removeIf(p -> !(p >=70 && p <=79));
        gradeOfD.removeIf(p -> !(p >=60 && p <=69));
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println("gradeOfA = " + gradeOfA.size());
        System.out.println("gradeOfB = " + gradeOfB.size());
        System.out.println("gradeOfC = " + gradeOfC.size());
        System.out.println("gradeOfD = " + gradeOfD.size());
        System.out.println("gradeOfF = " + gradeOfF.size());

    }
}
/*

8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));


  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59


        Write a program that can count the total numbers of grade A, B, C, D and F
 */