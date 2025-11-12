// Find the total number of pair in the Array whose sum is equal to the given value of x
public class twoSum {
    public static void main(String[] args) {
        int [] nums1 = {4,6,3,5,8,2};
        int [] nums2 = {1,4,5,6,3};
        int target1 = 7;
        int target2 = 12;
        int result1 = pairSum(nums1, target1);
        int result2 = tripleSum(nums2, target2);
        System.out.println(result1);
        System.out.println(result2);
    }

    static int pairSum(int [] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) { // First Number
            for(int j = i + 1; j < n; j++) {
                if(nums[i] + nums[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripleSum(int [] nums, int target) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) { //First number
            for (int j = i+1; j < n; j++) { // Second number
                for(int k = j+1; k < n; k++) { // Third Number
                    if(nums[i]+nums[j]+nums[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
