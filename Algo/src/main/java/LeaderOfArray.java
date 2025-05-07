import java.util.Arrays;

public class LeaderOfArray {

    //O(n2)
//    static void leadersOfArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            boolean isLeader = true;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] >= arr[i]) {
//                    isLeader = false;
//                    break;
//                }
//            }
//            if (isLeader) {
//                System.out.print(arr[i] + " ");
//            }
//        }
//    }
    //O(n)
    static void leadersOfArray(int[] arr) {
        int curr_leader = arr[arr.length - 1];
        System.out.print(curr_leader + " ");
        for (int i = arr[arr.length-2]; i > 0; i--) {
            if (arr[i] > curr_leader) {
                curr_leader = arr[i];
                System.out.print(curr_leader + " ");
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {8,11,5,11,7,6,3};
        leadersOfArray(arr);
    //    System.out.println(Arrays.toString(arr));
    }
}
