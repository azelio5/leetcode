import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
        reverseArray(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
