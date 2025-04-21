public class PaintersPartition {
    public static boolean isPossible(int[] ar, int b, int m) {
        int painters = 1;
        int pbc = 0;// painters board count
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > m) {
                return false;

            }
            if (pbc + ar[i] <= m) {
                pbc =pbc + ar[i];
            } else {
                painters++;
                if (painters > b) {
                    return false;
                }
                pbc = ar[i];
            }
        }
        return true;
    }

    static int MaxTime(int[] ar, int a, int b) {
        int l = 0, h = 0;
        for (int i = 0; i < ar.length; i++) {
            h = h + ar[i];
        }
        int result = -1; // if no changes -> no solution
        while (l <= h) {
            int m = (l + h) / 2;

            if (isPossible(ar, a, m) == true) {
                result = m;
                h = m - 1; // to minimize range
            } else {
                l = m + 1;
            }
        }
        return result * b;  //amount * per unit time
    }

    public static void main(String[] args) {
        int[] ar = {10, 20, 30, 40};
        int a = 2; // painters
        int b = 2; // time to one to paint 1
        System.out.println(MaxTime(ar, a, b));
    }
}
