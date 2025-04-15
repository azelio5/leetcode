public class SpanOfArray {
    public static void main(String[] args) {
        int[] arr = {20,42,88,10,99,6};
        System.out.println(spamOfArray(arr));

    }

    public static int spamOfArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return max - min;
    }
}
