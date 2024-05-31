import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println("digit is: " + digit);

        String binaryString = String.format("%8s", Integer.toBinaryString(digit)).replace(" ", "0");
        System.out.println("in binary: " + binaryString);

        System.out.println("Count of Set Bits are: " + countSetBits(digit));


    }


    //
    public static int countSetBits(int n) {
        int count =0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
