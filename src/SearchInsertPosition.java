public class SearchInsertPosition {
    public static void main(String[] args) {
        int [] nums = {1, 3, 5, 6};
         int target = 2;

         int result = search(nums, target);
        System.out.println(result);
    }

    static int search(int [] nums, int target) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
            i++;
        }
        return nums.length;
    }
}
