public class MergeSortedArrays {
//    public static float findMedian(int[] arr1, int[] arr2) {
//        int i = 0, j = 0, k = 0;
//
//        int[] mergedArray = new int[arr1.length + arr2.length];
//
//        while (i < arr1.length && j < arr2.length) {
//            if (arr1[i] < arr2[j]) {
//                mergedArray[k] = arr1[i];
//                i++;
//                k++;
//            } else {
//                mergedArray[k] = arr2[i];
//                j++;
//                k++;
//            }
//        }
//        while (i < arr1.length) {
//            mergedArray[k] = arr1[i];
//            i++;
//            k++;
//        }
//        while (j < arr2.length) {
//            mergedArray[k] = arr2[j];
//            j++;
//            k++;
//        }
//        if (mergedArray.length % 2 == 0) {
//            int mid = mergedArray.length / 2;
//            return (float) (mergedArray[mid] + mergedArray[mid - 1]) / 2;
//        } else {
//            int mid = mergedArray.length / 2;
//            return mergedArray[mid];
//        }
//    }
// O(m+n)
//    public static float findMedian(int[] arr1, int[] arr2) {
//        int i = 0, j = 0, k = 0;
//
//        int[] mergedArray = new int[arr1.length + arr2.length];
//
//        while (i < arr1.length && j < arr2.length && k <= mergedArray.length/2) {
//            if (arr1[i] < arr2[j]) {
//                mergedArray[k] = arr1[i];
//                i++;
//                k++;
//            } else {
//                mergedArray[k] = arr2[i];
//                j++;
//                k++;
//            }
//        }
//        while (i < arr1.length && k <= mergedArray.length/2) {
//            mergedArray[k] = arr1[i];
//            i++;
//            k++;
//        }
//        while (j < arr2.length && k <= mergedArray.length/2) {
//            mergedArray[k] = arr2[j];
//            j++;
//            k++;
//        }
//        if (mergedArray.length % 2 == 0) {
//            int mid = mergedArray.length / 2;
//            return (float) (mergedArray[mid] + mergedArray[mid - 1]) / 2;
//        } else {
//            int mid = mergedArray.length / 2;
//            return mergedArray[mid];
//        }
//    }

    public static float findMedian(int[] arr1, int[] arr2) {
        if (arr2.length < arr1.length) {
            return findMedian(arr2, arr1);
        }
        int l = 0, h = arr1.length;

        while (l < h) {
            int m1 = (l + h) / 2;
            int m2 = ((arr1.length + arr2.length + 1) / 2) - m1;       //+1 to work with even and odd

            int l1 = (m1 == 0) ? Integer.MIN_VALUE : arr1[m1 - 1];
            int r1 = (m1 == arr1.length) ? Integer.MAX_VALUE : arr1[m1];

            int l2 = (m2 == 0) ? Integer.MIN_VALUE : arr2[m2 - 1];
            int r2 = (m2 == arr2.length) ? Integer.MAX_VALUE : arr2[m2];

            if (l1 <= r2 && l2 <= r1) {
                if ((arr1.length + arr2.length) % 2 == 0) {
                    return (float) (Integer.max(l1, l2) + Integer.min(r1, r2)) / 2;
                } else return (float)Integer.max(l1, l2);
            } else if (l2 > r1) {
                l = l1 + 1;
            } else h = m1 - 1;
        }
        return Float.NaN;

    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 8, 17};
        int[] arr2 = {5, 6, 7, 19, 21, 25};

        System.out.println(findMedian(arr1, arr2));
    }
}
