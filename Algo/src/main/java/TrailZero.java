import java.util.Scanner;

public class TrailZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");


        int digit = scanner.nextInt();

        System.out.println(trailingZeroes(digit));

    }

    static int trailingZeroes(int n) {
        int res = 0, powOf5 = 5; // 5 in pow 1 = 5

        while (n >= powOf5) {
            res = res + (n / powOf5);
            powOf5 = powOf5 * 5;
        }
        return res;
    }
}
