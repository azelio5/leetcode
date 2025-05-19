public class MaximumLengthOfAlternating {
    public static void main(String[] args) {
        int[] a = {8, 10, 13, 14};
        System.out.println(maximumLengthOfAlternating(a));
    }

    public static int maximumLengthOfAlternating(int[] arr) {
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0 &&
                    arr[i - 1] % 2 != 0
                    || arr[i] % 2 != 0 &&
                    arr[i - 1] % 2 == 0) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else count = 1;
        }
        return maxCount;
    }
}
