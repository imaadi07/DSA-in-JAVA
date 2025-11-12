public class CountDigit {
    public static void main(String[] args) {
        int n = 65784383;
        reverseNumber(n);
    }

    static void reverseNumber(int n) {
        while(n > 0) {
            int rem = n%10;
            System.out.print(rem+ " ");
            n = n/10;
        }
    }
}
