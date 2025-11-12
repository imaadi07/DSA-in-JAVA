import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of the matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter "+n*n+" elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Sum is: "+diagonalSum(matrix));
    }

    static int diagonalSum(int[][] matrix) {
        int sum = 0;
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            sum += matrix[i][n - i - 1];
        }

        if(n % 2 != 0) {
            int center = matrix[n/2][n/2];
            sum = sum - center;
        }

        return sum;
    }
}
