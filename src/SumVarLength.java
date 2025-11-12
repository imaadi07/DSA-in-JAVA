public class SumVarLength {
    public static void main(String[] args) {
        int[] nums = {3,1,1,2};
        int result = Sum(nums);
        System.out.println(result);
    }

    static int Sum(int[] nums) {
        int totalSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currsum = 0;
            for (int j= i-1; j <=i; j++) {
                currsum += nums[j];
            }
            totalSum += currsum;
        }
        return totalSum;
    }
}
