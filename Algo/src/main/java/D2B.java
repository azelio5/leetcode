import java.util.Scanner;

public class D2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decInput = input.nextInt();
        String binary = decimalToBinary(decInput);
        System.out.println("Binary is: " + binary);
        int decimal = binaryToDecimal(binary);
        System.out.println("Decimal is: " + decimal);
    }

    public static String decimalToBinary(int decimal) {
        String binary = ""; // initialize an empty string to hold the binary digits

        while (decimal > 0) {
            int remainder = decimal % 2; // get the remainder of dividing the decimal by 2
            binary = remainder + binary; // prepend the remainder to the binary string
            decimal = decimal / 2; // divide the decimal by 2
        }
        return binary;
    }

    static int binaryToDecimal(String binary) {
        int result = 0;
        int powOf2 = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result = result + powOf2;
            }
            powOf2 = powOf2 * 2;
        }
        return result;

    }
}
