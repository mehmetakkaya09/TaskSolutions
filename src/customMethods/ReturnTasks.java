package customMethods;

import java.util.Arrays;

public class ReturnTasks {
    public static void main(String[] args) {
        int res = frequencyOfWord("Java java java python python","java");
        System.out.println(res);

        boolean res2 = isAnagram("ddssff","ssddff");
        System.out.println(res2);

        String res3 = reverse("Java");
        System.out.println(res3);

        String str = "Level";
        boolean res4 = isPalindrome("level");
        System.out.println(res4);
    }

    public static int frequencyOfWord(String sentence, String word){
        int frequencyOfWord = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.contains(word)) {
                frequencyOfWord++;
                sentence = sentence.replaceFirst(word, "");
            }else
                break;
        }
        return frequencyOfWord;
    }
    public static boolean isAnagram(String str1, String str2){
        boolean isAnagram = true;
        char[] splitStr1 = str1.toCharArray();
        char[] splitStr2 = str2.toCharArray();

        Arrays.sort(splitStr1);
        Arrays.sort(splitStr2);
        isAnagram = Arrays.equals(splitStr1,splitStr2);
        return isAnagram;

    }
    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i>=0;i--){
            reverse+=  "" + str.charAt(i);
        }
        return reverse;
    }
    public static boolean isPalindrome(String str){
        boolean isPalindrome = str.equalsIgnoreCase(reverse(str));
        return isPalindrome;
    }



}
/*
By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */