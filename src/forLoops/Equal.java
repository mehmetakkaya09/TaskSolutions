package forLoops;

public class Equal {
    public static void main(String[] args) {
        /*Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a string");
        String str= scanner.nextLine().toLowerCase();
        int countCat=0;
        int countDog=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.contains("cat")) {
                str = str.replaceFirst("cat", "");
                countCat++;
            }
            if (str.contains("dog")) {
                str = str.replaceFirst("dog", "");
                countDog++;
            }
        }if (countCat==countDog) System.out.println("true");
        else System.out.println("false");

         */



        String word = "caT dog dogG cAt";
        word = word.toLowerCase();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.contains("cat")){
                word = word.replaceFirst("cat", "");

                sum1++;
            }
            if (word.contains("dog")){
                word = word.replaceFirst("dog", "");

                sum2++;
            }

        }
        if (sum1 == sum2){
            System.out.println("true");
        }else
            System.out.println("false");


    }
}
/*
write a program to print true if the string "cat" and "dog" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
 */