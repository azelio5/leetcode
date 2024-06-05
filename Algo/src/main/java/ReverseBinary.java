public class ReverseBinary {
    public static void main(String[] args) {
        System.out.println(reverseBinary(1));
    }
    public static int reverseBinary(int n) {
        int f = 31, l = 0;
        int rev = 0;

        while (f > l) {
            if ((n & (1 << f)) != 0) {
                rev = rev | (1 << l);
            }
            if ((n & (1 << l)) != 0) {
                rev = rev | (1 << f);
            }
            f--;
            l++;
        }
        return rev;
    }
}
