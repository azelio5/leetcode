public class WoodCutting {

    private static int findWoodCount(int[] ht, int m) {
        int wc = 0;
        for (int i = 0; i < ht.length; i++) {
            if (ht[i] > m) {
                wc = wc + (ht[i] - m);
            }
        }
        return wc;
    }

    static int machineHeight(int[] ht, int b) {
        int max = 0;
        for (int i = 0; i < ht.length; i++) {
            if (ht[i] > max) {
                max = ht[i];
            }
        }
        int low = 0, high = max, mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int wc = findWoodCount(ht, mid);
            if (wc == b || low == mid) return mid;
            else if (wc > b) low = mid;
            else high = mid;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] height = {20, 15, 10, 17};
        int b = 8;
        System.out.println(machineHeight(height, b));

    }
}
