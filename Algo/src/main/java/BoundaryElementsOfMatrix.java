public class BoundaryElementsOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        printBoundary(arr);

    }

    public static void printBoundary(int[][] matrix) {

        int i = 0, j = 0;

        for (j = 0; j < matrix.length; j++) {
            System.out.println(matrix[i][j]);
        }

        j = matrix.length - 1;

        for (i = 1; i < matrix.length; i++) {
            System.out.println(matrix[i][j]);
        }

        i= matrix.length - 1;

        for (j= matrix.length - 2; j >= 0; j--) {
            System.out.println(matrix[i][j]);
        }

        j = 0;

        for (i = matrix.length - 1; i >= 0; i--) {
            System.out.println(matrix[i][j]);
        }

    }
}
