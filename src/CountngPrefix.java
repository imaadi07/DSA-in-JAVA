public class CountngPrefix {
    public static void main(String[] args) {
        String[] words = {"pay","attention","practice","attend"};
        String pref = "at";
        int result = countPrefix(words, pref);
        System.out.println(result);
    }

    static int countingPrefix(String[] words, String pref) {
        int count = 0;
        for (String str : words) {
            if (str.length() >= pref.length()) {
                if (str.substring(0, pref.length()).equals(pref)) {
                    count++;
                }
            }
        }
        return count;
    }

    static int countPrefix(String[] words, String pref) {
        int count = 0;
        for(String s:words) {
            if(s.startsWith(pref)) {
                count++;
            }
        }
        return count++;
    }
}
