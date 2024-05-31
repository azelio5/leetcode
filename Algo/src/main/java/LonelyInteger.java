import java.util.Arrays;
import java.util.HashSet;

public class LonelyInteger {

    //O(N LogN)
//    public static int lonelyInteger(int[] arr) {
//        //work only with sorted
//        Arrays.sort(arr);  //O(N Log N)
//        //-2 coz couples
//        for (int i = 0; i < arr.length - 2; i += 2) { //O(N)
//            if (arr[i] != arr[i + 1]) {
//                return arr[i];
//                //if not here
//            }
//            //last element
//
//        }
//        return arr[arr.length - 1];
//    }

//    public static int lonelyInteger(int[] arr) {
//        HashSet<Integer> set = new HashSet<>();
//
//        for (Integer i: arr) {
//            if(set.contains(i)) set.remove(i);
//            else set.add(i);
//        }
//
//        for (Integer i: set) {
//            return i;
//        }
//        return 1;
//    }

    public static int lonelyInteger(int[] arr) {
        int result = 0;
        for (int i: arr) {
            result^=i;

        }
        return result;
    }
}

