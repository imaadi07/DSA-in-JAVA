import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] nums = {1,0,1,0,1,0,1,0,1,0};
        int[] nums1 = {1,3,4,5,6,8};
        int[] nums2 = {2,4,6,7,10};
        EvenOddSort(nums1);
        Sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
        double x= 2;
        int n = 2;
        double result = Power(x, n);
        System.out.println(result);
        int[] sqArray = SquareArray(nums2);
//        System.out.println(Arrays.toString(reverse(sqArray, 0, sqArray.length-1)));
    }

    static double Power(double x, int n) {
        return Math.pow(x, n);
    }

    static int[] SquareArray(int[] nums) {
        int n = nums.length;
        int left = 0, right = n-1;
        int[] ans = new int[n];
        int k =0;
        while(left <= right) {
            if(Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[k++] = nums[left]*nums[left];
                left++;
            } else {
                ans[k++] = nums[right]*nums[right];
                right--;
            }
        }

        return ans;
    }

    static void Sort(int[] nums) {
        int left=0;
        int right= nums.length - 1;
        while(left < right) {
            if(nums[left] == 1 && nums[right] == 0) {
                swap(nums, left, right);
                left++;
                right--;
            }
            if(nums[left] == 0) {
                left++;
            }
            if(nums[right] == 1) {
                right--;
            }
        }
    }

    static void EvenOddSort(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            if(nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                swap(nums, left, right);
                left++;
                right--;
            }
            if(nums[left] % 2 == 0) left++;
            if(nums[right] % 2 != 0) right--;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
