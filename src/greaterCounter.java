public class greaterCounter {
    public static void main(String[] args) {
        int [] nums = {1,5,9,6,3};
        int target = 3;
        int result = countGreater(nums, target);
        System.out.println("Count of numbers that are greater than " + target + " are: " +result);
    }

    static int countGreater(int [] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(target < nums[i]) {
                count++;
            }
        }
        return count;
    }
}
