import java.util.Arrays;

public class LeftRightSum {
    public static void main(String[] args) {
        int[] nums = {10, 4, 8, 3};
        int[] result = leftRightDifference(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] ans = new int[n];

        left[0] = 0;
        for(int i=1; i<n; i++) {
            left[i] = left[i-1] +nums[i-1];
        }
        right[n-1] = 0;
        for(int i=n-2; i>=0; i--) {
            right[i] = right[i+1] + nums[i+1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }
        return ans;
    }

}
