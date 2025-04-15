public class BitonicArray {

    static int ascendingBinarySearch(int[] arr, int key, int range) {
        int low = 0;
        int high = range;
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

    static int descendingBinarySearch(int[] arr, int key, int range) {
        int low = range;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                low = mid + 1;
            } else {

                high = mid - 1;
            }
        }
        return -1;
    }

    static int findBitonicPoint(int[] arr) {
        int left = 0, right = arr.length - 1, mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return -1;
    }

    static int searchBitonic(int[] arr, int key, int bIndex) {
        if (key == arr[bIndex]) return bIndex;
        if (key > arr[bIndex]) return -1;
        int result1 = ascendingBinarySearch(arr, key, bIndex - 1);
        if (result1 != -1) {
            return result1;
        }
        int result2 = descendingBinarySearch(arr, key, bIndex + 1);
        if (result2 != -1) {
            return result2;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 3, 2, 1};

        int b = 80;

        int bIndex = findBitonicPoint(arr);

        System.out.println(searchBitonic(arr, b, bIndex));
    }
}
