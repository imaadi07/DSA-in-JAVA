import java.util.Arrays;

public class FirstLastPos {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];

        range[0] = -1;
        range[1] = -1;

        for(int i=0; i< nums.length; i++) {
            if (nums[i] == target) {
                if (range[0] == -1) {
                    range[0] = i;
                }
                range[1] = i;
            }
        }
        return range;
    }
}
