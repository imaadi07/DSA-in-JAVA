import java.util.ArrayList;
public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper Class
//        Integer i = Integer.valueOf(45);
//        System.out.println(i);
        // Array list creation: length is dynamic
        ArrayList<Integer> l1 = new ArrayList<>();

        // Adding new elements in the end
        l1.add(8);
        l1.add(25);

        //accessing elements
        System.out.println(l1.get(0));

        // accessing elements using for loop
//        for (Integer integer : l1) {
//            System.out.println(integer);
//        }

        // printing the whole list
        System.out.println(l1);

        // Adding elements at random index
        l1.add(0, 100);
        System.out.println(l1);

        // removing element from certain index
        l1.remove(2);
        System.out.println(l1);

        // removing element e
        l1.remove(Integer.valueOf(8));
        System.out.println(l1);

        // Checking if an element exists or not
        boolean ans = l1.contains(100);
        System.out.println(ans);

        //if i don't specify the class, we can put anything inside
        ArrayList l2 = new ArrayList();
        l2.add("hello");
        l2.add(12.056);
        l2.add(1234);
        l2.add("Aditya");
        System.out.println(l2);
    }
}
