public class isSorted {
    public static void main(String[] args) {
        int [] nums = {1,2,3,8,5,6};
        boolean result = isSort(nums);
        System.out.println("Sorted: "+result);
    }

    static boolean isSort(int [] nums) {
        for( int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i-1]) {
                return false;
            }
        }
        return true;
    }
}
