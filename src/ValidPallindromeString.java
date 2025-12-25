public class ValidPallindromeString {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPallindrome(s));
        // isPallindrome(s);
    }

    public static boolean isPallindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "");
        clean = clean.toLowerCase();
        int i= 0;
        int j = clean.length() - 1;
        System.out.println(clean);
        while(i < j) {
            if(clean.charAt(i) == clean.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
