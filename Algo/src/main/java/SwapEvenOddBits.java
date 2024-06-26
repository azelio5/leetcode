import java.util.Scanner;

public class SwapEvenOddBits {
    static int swapEvenOddBits(int n){
        return ((n & 0xAAAAAAAA)>>>1)|((n & 0x55555555)<<1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println("digit is: " + digit);

        String binaryString = String.format("%8s", Integer.toBinaryString(digit)).replace(" ", "0");
        System.out.println("in binary: " + binaryString);

        String n = String.format("%8s", Integer.toBinaryString(swapEvenOddBits(digit))).replace(" ", "0");
        System.out.println("Swapped: " + n);
    }
}
