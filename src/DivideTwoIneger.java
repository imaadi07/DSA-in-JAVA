public class DivideTwoIneger {
    public static void main(String[] args) {
        int divident = -2147483648;
        int divisor = -1;
        int result = divide(divident, divisor);
        System.out.println(result);
    }

    static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {
            long temp = b;
            int multiple = 1;

            while ((temp << 1) <= a) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }
}
