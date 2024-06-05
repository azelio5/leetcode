import java.util.Scanner;

public class TrailingZeros {
    public static int trailingZeroes(int n){
        return (int) (Math.log10((n&n-1) ^n)/Math.log10(2));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digit: ");

        int digit = scanner.nextInt();

        System.out.println("digit is: " + digit);

        String binaryString = String.format("%8s", Integer.toBinaryString(digit)).replace(" ", "0");
        System.out.println("in binary: " + binaryString);

        System.out.println("numb Trailing zeroes " + trailingZeroes(digit));
    }

}
