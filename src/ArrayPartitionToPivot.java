import java.util.Arrays;

public class ArrayPartitionToPivot {
    public static void main(String[] args) {
     int[] nums = {9,12,5,10,14,3,10};
     int[] result = pivotArray(nums, 10);
        System.out.println(Arrays.toString(result));
    }

    static int[] pivotArray(int[] nums, int pivot) {
        int lCount = 0;
        int gCount = 0;
        int pCount = 0;

        for(int num:nums) {
            if(num < pivot) {
                lCount++;
            } else if(num > pivot) {
                gCount++;
            } else {
                pCount++;
            }
        }

        int i = 0;
        int j = lCount;
        int k = lCount + pCount;

        int[] ans = new int[nums.length];

        for(int num : nums) {
            if(num < pivot) {
                ans[i] = num;
                i++;
            } else if(num > pivot) {
                ans[k] = num;
                k++;
            } else {
                ans[j] = num;
                j++;
            }
        }
        return ans;
    }
}
