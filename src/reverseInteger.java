import java.lang.Integer;

public class reverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        int result = reverse(x);
        System.out.println(result);
    }

    static int reverse(int x) {
        long rev = 0;

        while(x != 0) {
            int rem = x % 10;
            rev = rev*10 + rem;
            x = x / 10;

            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) rev;
    }
}
