//You are given an integer array bloomDay, an integer m and an integer k.
//
//You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
//
//The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can be used in exactly one bouquet.
//
//Return the minimum number of days you need to wait to be able to make m bouquets from the garden. If it is impossible to make m bouquets return -1.


public class MakeBouqetue {

        public static int minDays ( int[] ar, int boq, int flowers){
            if (boq * flowers > ar.length) {
                return -1;
            }
            int l = ar[0];
            int h = ar[0];

            for (int i = 0; i < ar.length; i++) {
                if (ar[i] < l) {
                    l = ar[i];
                }
                if (ar[i] > h) {
                    h = ar[i];
                }
            }
            int res = -1;
            while (l <= h) {
                int m = (l + h) / 2;

                if (isPossible(ar, boq, flowers, m)) {
                    res = m;
                    h = m - 1;
                } else {
                    l = m + 1;
                }
            }
            return res;

        }

        private static boolean isPossible ( int[] ar, int boq, int flowers, int m){
            int adj = 0;
            int bc = 0;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] <= m) {
                    adj++;
                    if (adj == flowers) {
                        bc++;
                        if (bc == boq) {
                            return true;
                        }
                        adj = 0;
                    }
                } else {
                    adj = 0;
                }
            }
            return false;
        }



    public static void main(String[] args) {
        int[] ar = {2, 5, 2, 9, 3, 10, 4, 6, 5, 6};
        int boq = 0;
        int flowers = 2;
        System.out.println(minDays(ar, boq, flowers));
    }
}
