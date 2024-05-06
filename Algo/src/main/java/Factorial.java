import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println(digit);

        System.out.println(fact(digit));
    }

    public static int fact(int n) {
        int res = 1; // first value of factorial - 0! = 1; 1! = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
