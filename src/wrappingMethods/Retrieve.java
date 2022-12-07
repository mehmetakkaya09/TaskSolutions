package wrappingMethods;

public class Retrieve {
    public static void main(String[] args) {
        String sentence = "Wooden Spoon!";
        String letters = "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))){
                letters+=sentence.charAt(i);
                continue;
            }
            if (Character.isDigit(sentence.charAt(i))){
                digits += sentence.charAt(i);
                continue;
            }
            if (!Character.isLetterOrDigit(sentence.charAt(i))){
                specialChars+=sentence.charAt(i);
            }

        }
        System.out.println("letters = \"" + letters + "\"");
        System.out.println("digits = \"" + digits + "\"");
        System.out.println("specialChars = \"" + specialChars + "\"");
    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */