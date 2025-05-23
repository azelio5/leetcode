public class FrequencyOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {20};
        frequency(arr);
    }

    private static void frequency(int[] arr) {
        int freq = 1;
        int i = 1;
        while (i < arr.length) {
            while (i < arr.length && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + "  " + freq);
            freq = 1;
            i++;
        }
        if (arr.length == 1 || arr[i - 1] != arr[i - 2]) {
            System.out.println(arr[i - 1] + "  " + freq);
        }
    }
}
