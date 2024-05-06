import java.util.Scanner;

public class PrimeNumbers {


    //)(N)
//    static boolean isPrime(int n) {
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }

    //O(sqrt(N))

//    static boolean isPrime(int n) {
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }

    //O(sqrt(N)) but faster 6 time

    static boolean isPrime(int n) {
        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 digit: ");

        int a = scanner.nextInt();

        //      System.out.println("Prime: " + isPrime(a));
       // printPrime(a);

        sievePrintPrimes(a);
    }

    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    public static void sievePrintPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= n; j = j + i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }
}
