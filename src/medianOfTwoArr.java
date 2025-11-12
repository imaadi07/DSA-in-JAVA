import java.util.Arrays;

public class medianOfTwoArr {
    public static void main(String[] args) {
        int [] nums1 = {1,2};
        int [] nums2 = {3};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println(result);  // Expected output: 2.0
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] combined = new int[m + n];

        System.arraycopy(nums1, 0, combined, 0, m);
        System.arraycopy(nums2, 0, combined, m, n);

        Arrays.sort(combined);

        if (combined.length % 2 != 0) {
            return combined[combined.length / 2];
        } else {
            return (combined[(combined.length / 2) - 1] + combined[combined.length / 2]) / 2.0;
        }
    }
}
