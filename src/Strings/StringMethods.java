package Strings;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        /*
        String methodlarda değişkende değişiklik yapmak istiyorsak bunu iki türlü yapabiliriz
        1. yol; değişkeni herhangi bir isim değişikliği yapmadan sadece datasını değiştirebiliriz. örneğin;
        String name = "mehmet";
        name = name.toUpperCase(); burada zaten name değişkeni daha önce tanımlandığı için tekrar String tanımlanmadı
        2. yol ise; ilk değişken aynı şekilde durur ikinci sonucu ayrı bir değişken oluşturarak alırız. örneğin;
        String name = "mehmet";
        String named = name.toUpperCase(); burada yeni bir değişken olduğu için tekrar String named diye tanımlandı
        */
        String name = "mehmet";
        String named = name.toUpperCase();
        System.out.println(named);
        System.out.println("--------------------------");

        /*
        length() metodu int olarak sonuç verir. çünkü sonucumuz toplam sayıdır
        charAt(index numarası)metodu char olarak sonuç verir. çünkü içine index numarası gireriz ve o numaradaki char'ı getirir.
        toUpperCase ve toLowerCase metodları String sonuç getirir. çünkü sadece String olan metnin genelinde değişiklik yapar herhangi bir index numarası ya da rakamla çalışmaz.
         */
        String first = "String indexOf metodu sonucu int döndürür";
        int indexNum = first.indexOf("t");
        System.out.println(indexNum);
        int lastIndex = first.lastIndexOf("t");
        System.out.println(lastIndex);
        /*
        indexOf() metodunun içi String ile tanımlanır sonucu ise int olarak verir. çünkü kaç numaralı indexe ait olduğu bilgisini içerir. içine girilen String olan harf veya harflerin ilkine göre işlem yapılır. uniqe olarak doğru bir tanımlama olursa hatasız olarak index numarasını elde edebiliriz.
        lastIndexOf() metodu ise diğer metod ile aynı özelliklere sahip olup son index numarsını verir. "sondan başa" doğru hareket ederek girilen harfi okur
         */
        String repl = "hayat güzeldir";
        String repl2 = repl.replace("hayat","yaşamak");
        System.out.println(repl);
        System.out.println(repl2);
        String email = "mehmet@yahoo.com";
        String email2 = email.replace("yahoo", "gmail");
        System.out.println(email);
        System.out.println(email2);
        String del = "okumak önemlidir";
        String del2 = del.replace("okumak","").replace(" ","");
        System.out.println(del);
        System.out.println(del2);
        String result2 = "C# is fun, C# is cool";
        result2 =  result2.replace(" C#", "Java");
        System.out.println(result2);
        String result = "Java Java Java";

        //result = result.replace("Java", "Python");
        result = result.replaceFirst("Java", "Python");
        System.out.println(result);

        /*
        replace() metodunda bir kelime ya da kelime öbeğini başka bir kelime ya da öbekle değiştirebiliriz. komutun içine önce eski değer sonra da yeni değer araya virgül konarak yazılır bu şekilde kelimeler değişmiş olur.
        bu metod içi String olur ve sonuç da String döndürülür!
        bu metod da aynı indexOf() metodu gibi harfin ön ve arkasına gelen kelimelere duyarlıdır. bu şekilde kelime uniqe hale getirilecek değişiklik yapılabilir.
        replaceFirst() metodu ise girilen kelime ya da harfin sadece ilk olanını değiştirir. indexOf gibi soldan sağa doğru işlem yapar ancak onun gibi int sonuç vermez. aynı replace() gibi String sonuç döndürür.
         */

        String subs = "mehmet akkaya";
        String subs2 = subs.substring(0,6);
        System.out.println(subs2);
        String subs3 = subs.substring(7);
        System.out.println(subs3 );

        String word2 = "Python C# Ruby";

        String s1 = word2.substring(0,  word2.indexOf(" ") ); //"Python"

        String s2 = word2.substring( word2.indexOf(" ")+1 ,   word2.lastIndexOf(" ") ); //"C#"

        String s3 = word2.substring( word2.lastIndexOf(" ")+1  ); //"Language"

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        /*
        substring() metodunun içi index numarası ile doldurulur ve çıktıyı String olarak döndürür.
        1 - bu metodun ilk index numarasına karşılık gelen karakterden itibaren başlar ancak bitiş index numarasının bir önündeki harfteki karakter döndürülür son olarak örneğin;
        String subs = "mehmet akkaya";
        String subs2 = subs.substring(0,6);  burada mehmet kelimesini tam almak istiyorsam index numaramı 0'dan başlatmalıyım ve t ile bitmek istiyorsam "t=5" olmasına rağmen bir sonraki index numarasını girmem gerekir yani bitiş index numaram boşluk karakterine tekabül eden 6'dır.
        2- diğer kullanımında da tek bir index değeri girilir ve o değerden sonraki tüm karakterler döndürülür.
        3 - diğer String metodları ile kullanılabilir. özellikle length() ve indexOf()/lastIndexOf() ile!
         */
        String degis = "mehmet.akkaya@gmail.com";
        String degis2 = degis.substring(degis.indexOf("@") +1, degis.lastIndexOf("."));
        System.out.println(degis);
        System.out.println(degis2);
        Scanner input = new Scanner(System.in);
        System.out.println("uzantı giriniz!");
        String degis3 = input.next();
        degis2 = degis3;
        System.out.println("mehmet.akkaya@" +degis3+ ".com");
    }
}
