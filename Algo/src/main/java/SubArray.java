public class SubArray {

    static void subArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        subArray(arr);
    }
}
