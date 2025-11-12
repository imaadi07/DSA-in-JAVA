public class SqareRoot {
    public static void main(String[] args) {
        int num = 27;
        int result = newtonSqrt(num);
        System.out.println(result);
    }

    static int newtonSqrt(int n) {
        if (n == 0 || n == 1) return n;

        int x = n;
        int root = 0;

        while (x > n / x) {
            root = (x + n / x) / 2;
            if (root == x) break;
            x = root;
        }
        return root;
    }
}

