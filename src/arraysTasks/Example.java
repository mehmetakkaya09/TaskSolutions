package arraysTasks;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'D'; i++) {
            if (i == 'B')
                continue;
            System.out.print(i + " ");
            if (i == 'B')
                break;
        }

        String name = "mehmet ahmet veli ayşe fatma";
        String [] names = name.split(" ");
        System.out.println(Arrays.toString(names));
        String email = "mehmet@akkaya.com";
        String emails[] = email.split("@");
        System.out.println(Arrays.toString(emails));
        String sentence = "mehmet akkaya. hello world. kuyucaklı yusuf";
        String sentences[] = sentence.split("\\. ");
        System.out.println(Arrays.toString(sentences));
        // split metodunda sadece  .  (nokta) karakterine özgü bir kullanım vardır. noktaları atlamak istediğimizde \\ iki adet backslash koyup sonra  .  (nokta) işaretini koyarak noktalardan noktalara ayırabiliriz cümleyi!
        String mehmet = "mehmet";
        String letter[] = mehmet.split("");
        System.out.println(Arrays.toString(letter));
        // split metodunda "" boş şekilde tırnak kullanırsak her harfi ayrı ayrı ayırarak bir array içine atar!!




    }
}
