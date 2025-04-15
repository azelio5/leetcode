public class CountOfSmallElements {
    static int countOfSmallElements(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (key == arr[mid]) {
                while (mid + 1 < arr.length && arr[mid + 1] == key) {
                    mid++;
                }
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }
        if (arr[mid] > key) {  //if not exists
            return mid;
        } else {
            return mid + 1;
        }
    }

    public static void main(String[] args) {
//       int[] arr = {2, 6, 12, 18, 21, 26, 33, 42};
//       int[] arr = {2, 6, 12, 18, 21, 26, 26, 26};
        int[] arr = {2, 6, 12, 24, 26, 26, 28, 30};
        int key = 25;
        System.out.println(countOfSmallElements(arr, key));
    }
}
