public class BinarySearch {



    public static void main(String[] args) {
        int key = 15;
        int[] arr = {3, 5, 6, 8, 12, 15, 16, 19, 21};
        System.out.println(binarySearch(arr, key));


    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
