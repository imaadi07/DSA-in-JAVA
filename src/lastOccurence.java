public class lastOccurence {
    public static void main(String[] args) {
        int [] nums = {1, 5, 8, 1, 6};
        int target = 1;
        int result = lastOccured(nums, target);
        System.out.println("The " + target + " last occurred at index no.: " +result);
    }

    static int lastOccured(int [] nums, int target) {
        int lastIndex = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }
}
