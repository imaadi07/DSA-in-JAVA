public class ValidPallindrome {
    public static void main(String[] args) {
        String v1 = "1.2";
        String v2 = "1.10";
        int result = compareVersion(v1, v2);
        System.out.println(result);
    }

    static int compareVersion(String version1, String version2) {
        String[] part1 = version1.split("\\.");
        String[] part2 = version2.split("\\.");
        int v1 = Integer.parseInt(part1[0]);
        int v2 = Integer.parseInt(part2[0]);
        if( v2 > v1) {
            return 1;
        } else if( v2 < v1) {
            return -1;
        } else {
            return 0;
        }
    }
}
