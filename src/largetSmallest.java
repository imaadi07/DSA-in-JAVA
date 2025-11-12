public class largetSmallest {
    public static void main(String[] args) {
        int [] nums = {11,2,5,6,9};
        int largest = largest(nums);
        int smallest = smallest(nums);
        System.out.println("Largest: "+largest+" Smallest: "+smallest);
    }

    static int largest(int [] nums) {
        int largest = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    static int smallest(int [] nums) {
        int smallest = nums[0];
        for(int i=0; i< nums.length; i++) {
            if(nums[i] < smallest) {
                smallest = nums[i];
            }
        }
        return smallest;
    }
}
