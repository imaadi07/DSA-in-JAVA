public class firstOccurString {
    public static void main(String[] args) {
        String haystack = "butsad";
        String needle = "sad";
        int result = firstOccurrence(haystack, needle);
        System.out.println(result);
    }

    static int firstOccurrence(String haystack, String needle) {
//        int windowLength = needle.length();
//         if(windowLength > haystack.length()) return -1;
//
//         for(int p1 = 0; p1 <= haystack.length() - windowLength; p1++) {
//             String window = haystack.substring(p1, p1 + windowLength);
//             if(window.equals(needle)) {
//                 return p1;
//             }
//         }
//         return -1;
        return (haystack.indexOf(needle));
    }
}
