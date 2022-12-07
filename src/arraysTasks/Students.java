package arraysTasks;

public class Students {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = {'A','B','C'};
        for (int i = 0; i < names.length; i++) {
            if (scores[i] >= 90){
                grades[i] = 'A';
            }else if (scores[i] >= 80){
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            }else
                grades[i] = 'F';
            System.out.println(names[i] + "'s score is "+scores[i]+", and grade is " + grades[i]);

        }
    }
}
/*
4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */


/*
        String[] res = new String[names.length];
        for (int m = 0; m < scores.length; m++) {
            if (scores[m] >=90){
                grades[m] = 'A';
            } else if (scores[m] >=80) {
                grades[m] = 'B';
            }else if (scores[m] >=70) {
                grades[m] = 'C';
            }else if (scores[m] >=60) {
                grades[m] = 'D';
            }else
                grades[m] = 'F';
            for (int i = 0, j = 0, k=0; i < names.length; i++, j++,k++) {
                res[i] = names[i] + "'s score is "+scores[k]+ ", and grade is " + grades[m] +"\n";

            }
        }

        System.out.println(Arrays.toString(res));

 */