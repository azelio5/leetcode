public class MaxAndPair {
    public static void main(String[] args) {
        int arr[] = {16, 9, 6, 13};
        System.out.println(maxAndValue(arr));

    }

    public static int checkBits(int[] arr, int mask) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((mask & arr[i]) == mask) { //if this -> bit is set
                count++;
            }
        }
        return count;
    }

    static int maxAndValue(int[] arr) {
        int mask = 0;
        int result = 0;

        for (int i = 31; i >= 0; i--) {
            mask = (1 << i) | result;
            int count = checkBits(arr, mask);
            if (count >= 2) {
                result = result | mask;
            }
        }
        return result;
    }

}
