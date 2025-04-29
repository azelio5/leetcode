public class RotateArray {

//Naive just one ratation
//    static void rotate(int[] nums) {
//        int temp = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            nums[i-1] = nums[i];
//        }
//        nums[nums.length - 1] = temp;
//    }
// O(k*n) - very bad
//    static void rotateByOnce(int[] nums) {
//        int temp = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            nums[i - 1] = nums[i];
//        }
//        nums[nums.length - 1] = temp;
//    }
//    static void rotate(int[] nums, int k) {
//        k = k % nums.length;
//        if (k < 0) {
//            k = k + nums.length;
//        }
//        for (int i = 1; i <= k; i++) {
//            rotateByOnce(nums);
//        }
//    }


//Optimal

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k < 0) {
            k = k + nums.length;
        }
        reverse(nums, k, nums.length-1);

        reverse(nums, 0, k-1);

        reverse(nums, 0, nums.length-1);

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            ++start;
            --end;
        }

    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};

        for (int j : a) {
            System.out.print(j);
        }

        rotate(a, 2);

        System.out.println();

        for (int j : a) {
            System.out.print(j);
        }
    }
}
