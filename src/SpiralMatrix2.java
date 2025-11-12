import java.util.Scanner;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        int[][] result = Spiral(n);
        System.out.println("Spiral Matrix: ");
        Print(result);
    }

    static int[][] Spiral(int n) {
        int[][] matrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n-1;
        int leftCol = 0;
        int rightCol = n-1;
        int totalElement = 1;
        while (totalElement <= n*n) {
            //  topRow -> leftCol to rightCol
            for (int j = leftCol; j <=rightCol && totalElement <= n * n; j++) {
                matrix[topRow][j] = totalElement;
                totalElement++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int j=topRow; j<=bottomRow && totalElement <= n * n; j++) {
                matrix[j][rightCol] = totalElement;
                totalElement++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int i = rightCol; i >= leftCol && totalElement <= n * n; i--) {
                matrix[bottomRow][i] = totalElement;
                totalElement++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i=bottomRow; i >= topRow && totalElement <= n * n; i--) {
                matrix[i][leftCol] = totalElement;
                totalElement++;
            }
            leftCol++;
        }
        return matrix;
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
