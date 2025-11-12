public class LongestSubstring {
    public static void main(String[] args) {
        String s = "pwwkew";
        int result = subStringLength(s);
        System.out.println(result);  // Output will be 3
    }

    static int subStringLength(String s) {
        int n = s.length();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[256];
            int count = 0;

            for (int j = i; j < n; j++) {
                if (visited[s.charAt(j)]) {
                    break;
                }
                visited[s.charAt(j)] = true;
                count++;
                if (count > maxLen) {
                    maxLen = count;
                }
            }
        }

        return maxLen;
    }
}
