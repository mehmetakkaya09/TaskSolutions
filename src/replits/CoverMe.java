package replits;

public class CoverMe {
    public static String coverString(String main, String coverMe) {
        String coverString = "";
        if (main.contains(coverMe)) {
            String splitText[] = main.split(coverMe);
            for (int i = 0; i < splitText.length; i++) {
                if (i == splitText.length - 1) {
                    if (main.substring(main.length() - coverMe.length()).equalsIgnoreCase(coverMe)){
                        coverString += splitText[i] + "[" + coverMe + "]";
                        break;
                    }
                    coverString += splitText[i];
                    break;
                }
                coverString += splitText[i] + "[" + coverMe + "]";
            }
        }else
            coverString = "[" + main + "]";
        return coverString;
    }

    public static void main(String[] args) {
        System.out.println(coverString("hello hello", "ello"));
    }
}
/*
        if (main.contains(coverMe)){
            coverString = main.substring(0,main.indexOf(coverMe)) + "[" + main.substring(main.indexOf(coverMe),main.indexOf(coverMe)+ coverMe.length()) + "]" + main.substring(main.indexOf(coverMe) + coverMe.length());
            //coverString = main.substring(0,main.indexOf(coverMe) + coverMe.length());
        }
        return coverString;
 */