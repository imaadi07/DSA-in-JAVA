import java.util.Arrays;
public class TwoSum2 {
    public static void main(String[] args) {
        int [] numbers = {2,7,11,15};
        int target = 9;

        int [] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));

    }

    static int[] twoSum(int [] numbers, int target) {
        if(numbers.length == 0) return new int[0];
        for (int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j ++) {
                if(numbers[i] + numbers[j] == target) {
                    return new int[]{i+1, j+1};
                }

            }
        }
        return new int[0];
    }

}
