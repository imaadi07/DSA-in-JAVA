public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }

    static boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i-1]) {
                dec = false;
            }
            if(nums[i] < nums [i-1]) {
                inc = false;
            }
        }
        return inc || dec;
    }
}
