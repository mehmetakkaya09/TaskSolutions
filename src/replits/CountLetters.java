package replits;

public class CountLetters {
    public static String countLetters(String str){
        String countLetters = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            if (!(countLetters.contains(str.charAt(i) + ""))) {
                countLetters += count + ""+str.charAt(i);
            }
        }
        return countLetters;
    }

    public static void main(String[] args) {
        String sss = countLetters("appleeess");
        System.out.println(sss);
    }
}
