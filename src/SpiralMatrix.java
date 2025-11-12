import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of row*col: ");
        int r = sc.nextInt();;
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int total = r*c;

        System.out.println("Enter "+total+" elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral matrix is: ");
        Spiral(matrix, r, c);
    }

    static void Spiral(int[][] matrix, int r, int c) {
        int topRow = 0;
        int bottomRow = r-1;
        int leftCol = 0;
        int rightCol = c-1;
        int totalElement = 0;
        while (totalElement < r*c) {
            //  topRow -> leftCol to rightCol
            for (int j = leftCol; j <=rightCol && totalElement < r * c; j++) {
                System.out.print(matrix[topRow][j]+" ");
                totalElement++;
            }
            topRow++;

            // rightCol -> topRow to bottomRow
            for (int j=topRow; j<=bottomRow && totalElement < r * c; j++) {
                System.out.print(matrix[j][rightCol]+" ");
                totalElement++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int i = rightCol; i >= leftCol && totalElement < r * c; i--) {
                System.out.print(matrix[bottomRow][i]+" ");
                totalElement++;
            }
            bottomRow--;

            // leftCol -> bottomRow to topRow
            for (int i=bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.print(matrix[i][leftCol]);
                totalElement++;
            }
            leftCol++;
            System.out.print(" ");
        }
    }

    static void Print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
