package replits;

public class BiggestWord {
    public static void main(String[] args) {
        String[] words = {"five5","six666","one1111111111111","2two","four4444"};
        int length = words[0].length();
        String str2 = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > length ){
                length = words[i].length();
                str2 = words[i];
            }
        }
        System.out.println(str2);

        String sentence = "java is fun";
        String[] splitStr = sentence.split(" ");
        for (String s : splitStr) {
            System.out.println(s);
        }
        String[] split2 = sentence.split(" ");
        for (int i = split2.length - 1; i >= 0; i--) {
            System.out.print(split2[i] + " ");
        }
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
    }
}
