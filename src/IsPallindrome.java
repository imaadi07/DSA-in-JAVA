

public class IsPallindrome {
    public static void main(String[] args) {
        int x = -121;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }

    static boolean isPalindrome(int x) {
       String s = Integer.toString(x);
       String reversed = new StringBuilder(s).reverse().toString();
       return s.equals(reversed);
    }
}
