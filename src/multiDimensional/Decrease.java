package multiDimensional;

public class Decrease {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {4,5,6,7};
        int[] numbers3 = {8,9,10,11,12};

        int[][] multiNum = {numbers1,numbers2,numbers3};

        for (int i = multiNum.length - 1; i >= 0; i--) {
            for (int i1 = multiNum[i].length - 1; i1 >= 0; i1--) {
                System.out.print(multiNum[i][i1] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        for (int i = 0; i < multiNum.length; i++) {
            for (int j = multiNum[i].length - 1; j >= 0; j--) {
                System.out.print(multiNum[i][j] + " ");
            }
            System.out.println();
        }

    }
}
