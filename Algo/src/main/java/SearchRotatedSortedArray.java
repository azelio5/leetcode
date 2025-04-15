public class SearchRotatedSortedArray {

    public static int search(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            //left sorted portion
            else if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            //right sorted portion
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2};
        // int[] arr = {7, 8, 1, 2, 4, 5, 6};
    }

}

