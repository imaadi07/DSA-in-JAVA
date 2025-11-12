// Finding the occurence of an element in an array,

public class elementCounter {
    public static void main(String[] args) {
        int [] nums = {1, 2, 6, 1, 8, 3, 8};
        int target = 8;
        int result = occurenceCount(nums, target);
        System.out.println(result);
    }

    static int occurenceCount(int [] nums, int target) {
        int count = 0;
        for(int n: nums) {
            if(n == target) {
                count++;
            }
        }
        return count;
    }
}
