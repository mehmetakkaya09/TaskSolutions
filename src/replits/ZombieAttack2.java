package replits;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {
        int[] inhabitants = {10, 5, 0, 0, 4, 7, 6, 2};
        int[] dumyArray = new int[inhabitants.length];
        int day = 0;
        System.out.println("Day " + (day++) + " " + Arrays.toString(inhabitants));
        for (int j = 0; j < 100; j++) {
            if ((inhabitants[0] == 0) && (inhabitants[1] == 0) && (inhabitants[2] == 0) && (inhabitants[3] == 0) && (inhabitants[4] == 0) && (inhabitants[5] == 0) && (inhabitants[6] == 0) && (inhabitants[7] == 0)) {
                break;
            }
            int k = 0;
            for (int each : inhabitants) {
                dumyArray[k++] = each;
            }
            for (int i = 0; i < inhabitants.length; i++) {
                if ((i == 0 && (inhabitants[i] == 0)) && (dumyArray[i] == inhabitants[i])) {
                    inhabitants[i + 1] = inhabitants[i + 1] / 2;
                } else if ((i == 1 && inhabitants[i] == 0) && (dumyArray[i] == inhabitants[i])) {
                    if (dumyArray[i-1] == inhabitants[i-1]){
                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    }
                    if (dumyArray[i+1] == inhabitants[i+1]) {
                        inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    }
                } else if ((i == 2 && inhabitants[i] == 0) && (dumyArray[i] == inhabitants[i])) {
                    if (dumyArray[i-1] == inhabitants[i-1]){
                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    }
                    if (dumyArray[i+1] == inhabitants[i+1]) {
                        inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    }
                } else if ((i == 3 && inhabitants[i] == 0 && (dumyArray[i] == inhabitants[i]))) {
                    if (dumyArray[i-1] == inhabitants[i-1]){
                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    }
                    if (dumyArray[i+1] == inhabitants[i+1]) {
                        inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    }

                } else if ((i == 4 && inhabitants[i] == 0 && (dumyArray[i] == inhabitants[i]))) {

                    if ((dumyArray[i-1] == inhabitants[i-1])){
                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    }

                    if (dumyArray[i+1] == inhabitants[i+1]) {
                        inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    }
                } else if ((i == 5 && inhabitants[i] == 0) && (dumyArray[i] == inhabitants[i])) {
                    if (dumyArray[i-1] == inhabitants[i-1]){
                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    }
                    if (dumyArray[i+1] == inhabitants[i+1]) {
                        inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    }
                } else if ((i == 6 && inhabitants[i] == 0) && (dumyArray[i] == inhabitants[i])) {
                    if (dumyArray[i-1] == inhabitants[i-1]){
                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    }
                    if (dumyArray[i+1] == inhabitants[i+1]) {
                        inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    }
                } else if ((i == 7 && inhabitants[i] == 0) && (dumyArray[i] == inhabitants[i])) {
                    if (dumyArray[i-1] == inhabitants[i-1]){
                        inhabitants[i - 1] = inhabitants[i - 1] / 2;
                    }
                }
            }
            System.out.println("Day " + (day++) + " " + Arrays.toString(inhabitants));

        }

        System.out.println("---- EXTINCT ----");

    }
}
/*






 */