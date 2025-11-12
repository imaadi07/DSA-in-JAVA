import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Array Length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Enter the number: ");
        int x = scn.nextInt();
        int ans = firstIndex(arr, 0, x);
        System.out.println("First Index of Occurrence of "+x+" is: "+ans);
    }

    public static int firstIndex(int[] arr, int idx,int x) {
        if(idx == arr.length) {
            return -1;
        }
        if(arr[idx] == x) {
            return idx;
        } else {
            return firstIndex(arr, idx + 1, x);
        }

    }
}
