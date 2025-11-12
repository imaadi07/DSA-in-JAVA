import java.util.Arrays;

public class SearchRoatatedArray {
    public static void main(String[] args) {

    }

    static int searchInRoatatedArray(int [] nums, int target) {
        if(nums.length == 0) return -1;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
