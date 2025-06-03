import java.util.Arrays;

public class ReverseTheColumnsOfA2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 6, 11, 16, 21},
                {2, 7, 12, 17, 22},
                {3, 8, 13, 18, 23},
                {4, 9, 14, 19, 24},
                {5, 10, 15, 20, 25},
        };
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(reverseColumns2DMatrix(arr)));


    }


    public static int[][] reverseColumns2DMatrix(int[][] matrix) {
        for (int[] el : matrix) {
            int left = 0, right = matrix[0].length - 1;
            while (left < right) {
                swap(left, right, el);
                left++;
                right--;
            }
        }
        return matrix;
    }
    private static void swap(int left, int right, int[] matrix) {
        int temp = matrix[left];
        matrix[left] = matrix[right];
        matrix[right] = temp;
    }
}
