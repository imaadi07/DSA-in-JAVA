public class DominantIndex {
    public static void main(String[] args) {
        int[] nums = {0,0,1,2};
        System.out.println(dominantIndex(nums));
    }

    static int dominantIndex(int[] nums) {
        if(nums.length == 0) return -1;
        boolean num = false;

        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}
