import java.util.Scanner;

public class Consecutive1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println("digit is: " + digit);

        String binaryString = String.format("%8s", Integer.toBinaryString(digit)).replace(" ", "0");
        System.out.println("in binary: " + binaryString);

        System.out.println("Does the binary form contains consecutive 1? " + containsConsecutive(digit));
        System.out.println("How many consecutive 1? " + countConsecutive1(digit));
    }

    public static boolean containsConsecutive(int n) {
        if ((n & (n << 1)) != 0) return true;
        return false;
    }

    public static int countConsecutive1(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n << 1);
            count++;
        }
        return count;
    }

}
