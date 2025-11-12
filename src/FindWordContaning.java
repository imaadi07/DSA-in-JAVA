import java.util.ArrayList;

public class FindWordContaning {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pear", "grape"};
        char x = 'a';
//        List<Integer> list = findWordsContaining(words, x);
//        System.out.println(list);
    }

    static ArrayList<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }
        return list;
    }
}
