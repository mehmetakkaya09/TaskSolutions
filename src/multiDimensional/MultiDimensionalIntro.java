package multiDimensional;


public interface MultiDimensionalIntro {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        int[] nums3 = {7,8,9};

        int[][] numSeries = {nums1,nums2,nums3};

        for (int[] numSery : numSeries) {
            for (int i = 0; i < numSery.length; i++) {
                System.out.println(numSery[i]);
            }
        }


    }
}
