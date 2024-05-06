import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println(digit);

        primeFactors(digit);

    }

    public static void primeFactors(int n) {

        int i = 2;
        while (i * i <= n) {
            while (n % i == 0) {
                System.out.println(i);
                n = n / i;
            }
            i++;
        }
        if (n > 1) {
            System.out.println(n);
        }

    }
}
