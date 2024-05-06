import java.util.Scanner;

// 123 /10 =12   count 1
//12 /10 = 1     count 2
//1 /10 = 0 - term cond; count 3

public class Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");


        int digit = scanner.nextInt();

        System.out.println(countDigits(digit));
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10; //remove last digit
            count++;
        }
        return count;
    }
}
