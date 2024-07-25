import java.util.Scanner;

public class ReverseBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println("digit is: " + digit);

        String binary = String.format("%8s", Integer.toBinaryString(digit)).replace(" ", "0");
        System.out.println("in binary: " + binary);

   //     String binary = Integer.toBinaryString(digit);

        System.out.println("___");
        System.out.println(nthPalinBin(digit));
        System.out.println(Integer.toBinaryString(nthPalinBin(digit)));

//        String n = String.format("%8s", Integer.toBinaryString(reverseBinary(digit))).replace(" ", "0");
//        System.out.println("Swapped: " + n);

    }

    public static int reverseBinary(int n, int len) {
        int f = len-1, l = 0;
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

    public static int nthPalinBin(int n) {
        int len = 0, count = 0;
        while (count < n) {
            len++;
            count = count + (int)Math.pow(2, (len - 1) / 2);
        }
        count = count - (int)Math.pow(2, (len - 1) / 2);
        int el = n - count - 1;
        int ans = (1 << len - 1) | (el << (len / 2));
        ans = ans | reverseBinary(ans, len);
        return ans;

    }
}
