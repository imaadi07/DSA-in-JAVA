import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];

        System.out.println("Enter the element of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose is: ");
//        int[][] result = transposeMatrix(a);
//        int[][] result = transpose(a, r, c);
//        printMatrix(result, c, r);
        transposeInplace(a, r, c);
        printMatrix(a, c, r);
    }

    static int[][] transpose(int[][] a, int r, int c) {
        int[][] ans = new int[c][r];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                ans[i][j] = a[j][i];
            }
        }
        return ans;
    }

    static void transposeInplace(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++) {
            for(int j=i; j<r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static int[][] transposeMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int[][] ans = new int[c][r];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    static void printMatrix(int[][] a, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j=0; j< c; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
