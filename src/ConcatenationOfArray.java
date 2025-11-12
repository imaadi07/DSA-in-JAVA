import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] result = concatenateArray(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] concatenateArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        int i = 0;
        int j = 0;
        while(j < 2*n) {
            if(i < n) {
                ans[j] = nums[i];
                i++;
                j++;
            } else {
                i = 0;
            }
        }
        return ans;
    }
}
