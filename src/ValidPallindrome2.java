public class ValidPallindrome2 {
    public static void main(String[] args) {
        String s = "aba";
        boolean result = validPallindrome(s);
        System.out.println(result);
    }
    static boolean validPallindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                right--;
                left++;
            } else {
                return isPallindrome(s, left+1, right) || isPallindrome(s, left, right - 1);
            }
        }
        return true;
    }

    static boolean isPallindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
