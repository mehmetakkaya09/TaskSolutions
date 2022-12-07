package customMethods;

public class InterviewQuestion {
    public static boolean isArmstrongNumber(int number){
        boolean isTrue = true;
        int pow = 0;
        int per = 0;

        int dumyNum = number;
        while (dumyNum > 0){
            per = dumyNum/10;
            dumyNum = per;
            pow++;
        }
        int dumyNum2 = number;
        int[] digits100 = new int[pow];
        int per2 = 0;
        int digIndex = 0;
        while (dumyNum2>0){
            digits100[digIndex++] = dumyNum2;
            per2 = dumyNum2/10;
            dumyNum2 = per2;
        }
        int[] digits = new int[pow];
        for (int i = 0; i < pow; i++) {
            digits[i] = digits100[i]%10;
        }
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            int res = 1;
            for (int j = 1; j <= digits.length; j++) {
                res *= digits[i];
            }
            sum += res;
        }
        if (sum == number){
            return isTrue;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(371));
    }

}
/*
Task 3 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three and added to obtain a number. If the number obtained equals the original number then, we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits
 */