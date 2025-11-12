public class SingleNumber {
    public static void main(String[] args) {
        int [] nums = {2,2,1};
        int result = singleOccurence(nums);
        System.out.println(result);
    }

    static int singleOccurence(int [] nums) {
        int count;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return nums[i]; // directly return the unique number
            }
        }
        return -1;
    }
}
