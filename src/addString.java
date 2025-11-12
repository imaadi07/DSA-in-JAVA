import java.util.Arrays;

public class addString {
    public static void main(String[] args) {
        String [] words = {"Hello","Alaska","Dad","Peace"};
        String [] result = isMatch(words);
        System.out.println(Arrays.toString(result));  // [Alaska, Dad]
    }

    static String[] isMatch(String [] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        String[] temp = new String[words.length];
        int index = 0;

        // Step 2: Check each word
        for (String word : words) {
            String s1 = word.toLowerCase();

            if (charInString(s1, firstRow) ||
                    charInString(s1, secondRow) ||
                    charInString(s1, thirdRow)) {
                temp[index++] = word;
            }
        }

        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    static boolean charInString(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean found = false;

            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) return false;
        }
        return true;
    }
}
