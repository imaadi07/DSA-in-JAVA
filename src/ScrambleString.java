import java.util.Random;

public class ScrambleString {
    public static void main(String[] args) {
        String s1 = "great";
        String s2 = "rgeat";
        boolean result = scrambleString(s1, s2);
        System.out.println(result);
    }

    static boolean scrambleString(String s1, String s2) {
        String s = scramble(s1);
        return s.equals(s2);
    }

    static String scramble(String s1) {
        if(s1.length() <= 1) {
            return s1;
        }

        Random rand = new Random();
        int index = rand.nextInt(s1.length() - 1) + 1;

        String left = s1.substring(0, index);
        String right = s1.substring(index);

        String scrambledLeft = scramble(left);
        String scrambledRight = scramble(right);

        if (rand.nextBoolean()) {
            return scrambledRight + scrambledLeft;
        } else {
            return scrambledLeft + scrambledRight;
        }
    }
}
