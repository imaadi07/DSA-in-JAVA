public class ScoreOfString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(scoreOfString(s));
    }

    static int scoreOfString(String s) {
        int sum = 0;

        for (int i = 1; i < s.length(); i++) {
            char one = s.charAt(i);
            char two = s.charAt(i - 1);
            sum += Math.abs((int) one - (int) two);
        }
        return sum;
    }
}
