package forLoops;

public class JavaRepeat {
    public static void main(String[] args) {
        int sum = 0;
        String word = "Java Java";
        word = word.toLowerCase();
        for (int i = 0; i < 2; i++) {
            if (word.contains("java")){
                sum++;
            }
        }
        System.out.println(sum);

    }
}
/*
write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create
 */