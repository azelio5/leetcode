import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println(digit);

        printDivisors(digit);
    }

    private static void printDivisors(int n) {
        int i = 0;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
//                if(i != n/i) System.out.println(n/i);
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.println(n / i);
            }

        }
    }
}
