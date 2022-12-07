package replits;

import java.util.Arrays;

public class ShortestWords {
    public static void main(String[] args) {
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String[] splitStr = str.split(", ");

        int length = splitStr[0].length();
        for (String word : splitStr) {
            if(word.length() <= length){
                length=word.length();
            }
        }
        int count = 0;
        for (String word : splitStr) {
            if (word.length() == length){
                count++;
            }
        }
        String[] newArray = new String[count];
        int i = 0;
        for (String word : splitStr) {
            if (word.length() == length){
                newArray[i++] = word;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }

}
