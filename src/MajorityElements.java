public class MajorityElements {
    public static void main(String[] args) {
        int [] nums = {8,8,7,7,7};
        int result = majority(nums);
        System.out.println(result);
    }

    static int majority(int [] nums) {
        int count = 0;
        int maj = nums.length / 2;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j =0; j< nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count > maj) {
                return nums[i];
            }
        }
        return -1;
    }
}
