public class FindFirstandLastPositionofElementinSortedArray {
    public static int[] searchRange(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int[] result = {-1, -1};

        while (low <= high) {
            mid = (low + high) / 2;
            if (target == nums[mid]) {
                result[0] = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
//reinitialize
        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            mid = (low + high) / 2;
            if (target == nums[mid]) {
                result[1] = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;

    }

    public static void main(String[] args) {
   //     System.out.println(searchRange());
    }
}
