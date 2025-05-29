import java.util.Arrays;

public class MedianOfRowWiseSortedMatrix {
    public static void main(String[] args) {

        int[][] arr2D = {
                {5, 11, 20, 35, 45},
                {1, 2, 3, 4, 6},
                {13, 15, 16, 19, 21}
        };

//        System.out.println(binarySearch(arr2D[0], 40));

        //   double median = findMedianSortedArray(arr2D);
        int medianOpt = findMedianSortedArrayOpt(arr2D);
        System.out.println(medianOpt);

    }

    public static int findMedianSortedArrayOpt(int[][] arr) {
        int min = arr[0][0], max = arr[0][0];
        int medianPos = (arr.length * arr[0].length + 1) / 2;  //rows*col
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] < min) {
                min = arr[i][0];
            }
            if (arr[i][arr[0].length - 1] > max) {
                max = arr[i][arr[0].length - 1];
            }
        }
        while (min < max) {
            int mid = (min + max) / 2;
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                int x = binarySearch(arr[i], mid);

                if (x >= 0) {
                    while (arr[i][x] == mid) {
                        x++;
                    }
                }else {
                    x = x * -1;
                }

                count += x;
            }
            if (count < medianPos) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        return min;
    }

    private static int findCount(int[] arr, int mid) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= mid) {
                count++;
            } else break;
        }
        return count;
    }

    static int binarySearch(int[] arr, int key) {
        int high = arr.length - 1;
        int low = 0;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key) {
                return key;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -low;
    }

    public static double findMedianSortedArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int index = 0;
        int[] arr1D = new int[rows * cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr1D[index++] = arr[i][j];
            }

        }
        int[] sortedArr = Arrays.stream(arr1D).sorted().toArray();

        System.out.println(Arrays.toString(sortedArr));


        if (sortedArr.length % 2 != 0)
            return sortedArr[sortedArr.length / 2];

        return (sortedArr[(sortedArr.length - 1) / 2] + sortedArr[sortedArr.length / 2]) / 2.0;


    }
}
