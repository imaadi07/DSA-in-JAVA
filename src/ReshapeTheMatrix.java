import java.util.Scanner;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and Col. of the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter "+r*c+" Elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the new row and col: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("The reshaped matrix is: ");
        int[][] result = reshape(matrix, r1, c1);
        Print(result);
    }

    static int[][] reshape(int[][] matrix, int r, int c) {
        int m = matrix.length;
        int n = matrix[0].length;
        int total = m*n;

        if(m == r && n == c) {
            return matrix;
        }
        if(total != r*c) {
            return matrix;
        }

        int nIndex = 0;
        int oIndex = 0;
        int[][] ans = new int[r][c];
        while(nIndex < r*c && oIndex < total) {
            ans[nIndex/c][nIndex%c] = matrix[oIndex/n][oIndex%n];
            nIndex++;
            oIndex++;
        }
        return ans;
    }

    static void Print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
