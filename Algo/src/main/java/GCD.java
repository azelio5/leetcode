import java.util.Scanner;

//greatest common devidor or highest common factor HCF
public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 digit: ");

        int a = scanner.nextInt();

        System.out.println("Enter 2 digit: ");

        int b = scanner.nextInt();

        System.out.println("GCD is " + gcd(a, b));

    }

    // BRUTE FORCE APPROACH

    // O(min(a,b))

//    private static int gcd(int a, int b) {
//        int min = Math.min(a, b);
//        System.out.println("Minimum is " + min);
//        //loop from end of min to 1
//        for (int i = min; i >= 1; i--) {
//            if (a % i == 0 && b % i == 0) {
//                return i;
//            }
//        }
//        return 1;
//    }

    //Alexander Euclid
    // O(max(a,b))


//    private static int gcd(int a, int b) {
//        while (a != b) {
//            if (a > b) a -= b;
//            else b -= a;
//        }
//        return a;
//    }

    //Gabriel Lame Optimized EA
    // O(LogN)
    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            if (a > b) a %= b;
            else b %= a;
        }
        return a != 0 ? a : b;
    }


}
