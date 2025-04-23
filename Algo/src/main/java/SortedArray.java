public class SortedArray {

    public static boolean isSortedArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] ar = {2, 90, 6, 8, 10, 12, 14};

        System.out.println(isSortedArray(ar));

    }

}
