package wrappingMethods;

public class UpperLower {
    public static void main(String[] args) {
        String str = "JAVA java";
        int upCount = 0;
        int lowCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))){
                upCount++;
                continue;
            }
            if (Character.isLowerCase(str.charAt(i))){
                lowCount++;
            }
        }
        System.out.println(upCount == lowCount);
    }
}
/*

4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */