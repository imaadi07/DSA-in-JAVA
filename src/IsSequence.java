public class IsSequence {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";
        boolean result = isSequence(s, t);
        System.out.println(result);
    }

    static boolean isSequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
