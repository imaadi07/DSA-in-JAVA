import java.util.Arrays;
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] result = threeSum(nums);

        if (result.length == 0) {
            System.out.println("No triplet found");
        } else {
            System.out.println("Indices: " + Arrays.toString(result));
            System.out.println("Values: " + nums[result[0]] + ", " + nums[result[1]] + ", " + nums[result[2]]);
        }
    }

    static int[] threeSum(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        return new int[]{i, j, k};
                    }
                }
            }
        }

        return new int[]{};
    }
}
