import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArrayListString {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(6);
        list.add(1);
        System.out.println("Original List: "+list);
        Collections.sort(list);
        System.out.println("Ascending List: "+list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending Order: "+list);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hii");
        list1.add("I");
        list1.add("Am");
        list1.add("Aditya");
        System.out.println("Orignal List: "+list1);
        Collections.sort(list1);
        System.out.println("Sorted List: "+list1);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse Order List: "+list1);

    }
}
