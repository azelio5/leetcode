public class Recursion {

    public static void main(String[] args) {
        //  System.out.println(fact(5));
        //  printN(5);
        //  System.out.println(countDigits(12345));
        //  System.out.println(sumOfDigits(15));

        String s = "abcd";

        System.out.println(reverseString(s,"", s.length()-1));
    }

    static String reverseString(String s, String r, int i) {
        if (i < 0) return r;
        return reverseString(s, r + s.charAt(i), i - 1);

    }

    static int fact(int n) {
        if (n == 1 || n == 0) return 1;
        return n * fact(n - 1);
    }

    static void printN(int n) {
        if (n == 0) {
            return;
        }
        printN(n - 1);  // changed if
        System.out.println(n);// reversed order

    }

    static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return countDigits(n / 10) + 1;
    }

    static int sumOfDigits(int n) {
        if (n == 0) return 0;
        return sumOfDigits(n / 10) + (n % 10);
    }
}
