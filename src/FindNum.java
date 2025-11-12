class Num {
    int [] arr = { 5, 7, 9 ,1 ,3};
    int x = 9;
    int ans = -1;
    void isPresent() {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.println("Found " + x + " at index " + ans);
    }
}

public class FindNum {
    public static void main(String[] args) {
        Num obj = new Num();
        obj.isPresent();
    }
}
