public class InverseOfArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 0, 4 };
        for (int j : arr) {
            System.out.print(j);
        }
        System.out.println();
        int[] inverseArray = inverseOfArray(arr);
        for (int j : inverseArray) {
            System.out.print(j);
        }
    }
    static int[] inverseOfArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            result[value] = i;
        }
        return result;
    }
}
