public class RootSquare {
    static int sqrt(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int l = 2; // coz 1 already
        int h = n / 2;
        int res = 0;
        while (l <= h) {
            int m = (l + h) / 2;
            if (m * m == n) {
                return m;
            } else if (m * m < n) {
                l = m + 1;
                res =m; // if floor
            }else {
                h = m - 1;
                //res = m; if ceiling
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 24;
        System.out.println(sqrt(n));
    }
}
