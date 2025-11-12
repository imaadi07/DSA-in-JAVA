import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int newLength = removeDuplicate(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    static int removeDuplicate(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
