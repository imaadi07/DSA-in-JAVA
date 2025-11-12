import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int n = sc.nextInt();

        System.out.println("Pascal's Triangle: ");
        int[][] result = pascalsTriangle(n);
        print(result);
        sc.close();
    }

    static int[][] pascalsTriangle(int n) {
        int[][] pascal = new int[n][];

        for (int i = 0; i < n; i++) {
            pascal[i] = new int[i+1];
            pascal[i][0] = pascal[i][i] = 1;

            for(int j=1; j<i; j++) {
                pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
            }
        }
        return pascal;
    }

    static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
