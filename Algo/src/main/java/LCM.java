import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 digit: ");

        int a = scanner.nextInt();

        System.out.println("Enter 2 digit: ");

        int b = scanner.nextInt();

        System.out.println("LCM is " + findLCM(a, b));

    }

//    public static int findLCM(int a, int b) {
//        int res = Math.max(a, b);
//
//        while (res % a != 0 || res % b != 0) {
//            res++;
//        }
//        return res;
//    }

    //FROM GCD
    //O(LogN)

    public static int findLCM(int a, int b) {
        return (a*b)/GCD.gcd(a,b);
    }
}
