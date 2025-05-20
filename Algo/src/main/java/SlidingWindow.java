public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 9, 31, -4, 21, 7};
        int k = 3;
        System.out.println(maxSumSubarray(arr, k));
    }
    static int maxSumSubarray(int[] arr, int k) {
        int wSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            wSum += + arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            wSum = wSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, wSum);
        }
        return maxSum;
    }
}
