import java.util.Arrays;
import java.util.Random;

public class NUnique {
    public static void main(String[] args) {
        int n = 3;
        int[] result = sumZero(n);
        System.out.println(Arrays.toString(result));
    }

    static int[] sumZero(int n) {
        int[] ans = new int[n];
        int num = 1;

        for (int i = 0; i < n - 1; i++) {
            ans[i] = num;
            ans[++i] = -num;
            num++;
        }

        if(n % 2 != 0) {
            ans[n-1] = 0;
        }
        return ans;
    }
}
