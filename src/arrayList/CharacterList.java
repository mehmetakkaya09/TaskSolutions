package arrayList;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CharacterList {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFGasd!";
        String[] strArray = str.split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArray));
        ArrayList<String> letters = new ArrayList<>(Arrays.asList(strArray));
        ArrayList<String> digits = new ArrayList<>(Arrays.asList(strArray));
        ArrayList<String> specials = new ArrayList<>(Arrays.asList(strArray));
        letters.removeIf(p-> !(p.charAt(0)>='A' && p.charAt(0)<= 'z'));
        digits.removeIf(p->!(p.charAt(0)>='0'&&p.charAt(0)<='9'));
        specials.removeIf(p->(p.charAt(0)>='0'&&p.charAt(0)<='9')||(p.charAt(0)>='A' && p.charAt(0)<= 'z'));
        System.out.println(specials);
        System.out.println(digits);
        System.out.println(letters);
        ArrayList<String> swap = new ArrayList<>(Arrays.asList(strArray));
        Collections.swap(swap,0,swap.size()-1);
        System.out.println(swap);
        ArrayList<Integer> listZero = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));
        int freq = Collections.frequency(listZero,0);
        listZero.removeIf(p->p==0);
        for (int i = 0; i < freq; i++) {
            listZero.add(0);
        }
        System.out.println(listZero);
    }
}
